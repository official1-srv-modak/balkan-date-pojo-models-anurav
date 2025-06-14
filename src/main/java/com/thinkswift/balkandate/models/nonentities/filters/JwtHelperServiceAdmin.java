package com.thinkswift.balkandate.models.nonentities.filters;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thinkswift.balkandate.models.entities.BalkanDateUser;
import com.thinkswift.balkandate.models.repo.BalkanDateUserRepo;
import com.thinkswift.balkandate.models.values.BalkanDateRoles;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

@Service
public class JwtHelperServiceAdmin {

    @Autowired
    private PasswordEncoder encoder;
    
    @Autowired
    BalkanDateUserRepo repo;

    @Value("${jwt.user.secret}")
    String jwtSecret;

    @Value("${jwt.user.expiration.ms}")
    long jwtExpiration;

    @Value("${jwt.server.user.invalid.token.prefix}")
    private String INVALID_TOKEN_PREFIX;


    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    private final Map<String, Date> invalidatedTokensInMemory = new ConcurrentHashMap<>();

    public void invalidateTokenInMemory(String token) {
        Claims claims = Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody();
        invalidatedTokensInMemory.put(token, claims.getExpiration());
    }


    public boolean isTokenValidInMemory(String token) {
        // Check if token is in invalidated list or has expired
        if (invalidatedTokensInMemory.containsKey(token)) {
            Date expiration = invalidatedTokensInMemory.get(token);
            if (expiration.before(new Date())) {
                invalidatedTokensInMemory.remove(token); // Clean up expired tokens
            }
            return false;
        }
        return true;
    }

    private boolean isRedisRunning() {
        try {
            // Attempt a ping to Redis
            boolean flag = redisTemplate.getConnectionFactory().getConnection().ping() != null;
            System.out.println("Redis-server status is : "+flag);
            return flag;
        } catch (Exception e) {
            System.out.println("Error checking Redis server status: " + e.getMessage());
            return false;
        }
    }

    public BalkanDateUser getUser(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        if(authHeader != null && authHeader.startsWith("Bearer ")) {
            BalkanDateUser balkanDateUser = validateToken(authHeader.substring(7));
            return balkanDateUser;
        }
        return null;
    }

    public void invalidateToken(String token) {

        if(isRedisRunning())
        {
            // Decode the token to get the expiration date
            Claims claims = Jwts.parser()
                    .setSigningKey(jwtSecret)
                    .parseClaimsJws(token)
                    .getBody();
            Date expiration = claims.getExpiration();

            // Store the token in Redis with a TTL matching the expiration date
            long ttl = expiration.getTime() - System.currentTimeMillis();

            redisTemplate.opsForValue().set(INVALID_TOKEN_PREFIX + token, "invalid", ttl, TimeUnit.MILLISECONDS);
        }
        else {
            // fall back to in-memory
            invalidateTokenInMemory(token);
        }
    }

    public boolean isTokenValid(String token) {
        // Check if the token is in the invalidated list in Redis
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        return ops.get(INVALID_TOKEN_PREFIX + token) == null;
    }

    public boolean generateApiKey(BalkanDateUser user) {
        if(repo.findByUsername(user.getUsername()) != null) {
            return false; // Username already exists
        }
        user.setPassword(encoder.encode(user.getPassword()));
        user.setRole(BalkanDateRoles.ADMIN.getValue());
        repo.save(user);
        return true;
    }

    public String generateToken(BalkanDateUser user) {
        Map<String, Object> claims = new HashMap<>();
        user.setPassword(""); // remove password from the token
        claims.put("user", user);

        long currentTimeMillis = System.currentTimeMillis();
        Date issuedAt = new Date(currentTimeMillis);
        Date expirationDate = new Date(currentTimeMillis + jwtExpiration);

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(user.getUsername())
                .setIssuedAt(issuedAt)
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS256, jwtSecret)
                .compact();
    }

    public String generateToken(BalkanDateUser user, BalkanDateRoles role) {
        Map<String, Object> claims = new HashMap<>();
        user.setPassword(""); // remove password from the token
        claims.put("user", user);
        claims.put("role", role);  // Add role as a claim


        long currentTimeMillis = System.currentTimeMillis();
        Date issuedAt = new Date(currentTimeMillis);
        Date expirationDate = new Date(currentTimeMillis + jwtExpiration);

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(user.getUsername())
                .setIssuedAt(issuedAt)
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS256, jwtSecret)
                .compact();
    }


    public BalkanDateUser validateToken(String token) {

        if(isRedisRunning())
        {
            if (!isTokenValid(token)) {
                System.out.println("Token is invalid or has been logged out.");
                return null;
            }

        }
        else {
            // fall back to in memory
            if (!isTokenValidInMemory(token)) {
                System.out.println("Token is invalid or has been logged out.");
                return null;
            }
        }

        // Decode if valid

        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(jwtSecret)
                    .parseClaimsJws(token)
                    .getBody();

            // Get the "user" claim as a LinkedHashMap
            Object userClaim = claims.get("user");

            // Convert LinkedHashMap to BalkanDateUser using ObjectMapper
            ObjectMapper mapper = new ObjectMapper();
            BalkanDateUser user = mapper.convertValue(userClaim, BalkanDateUser.class);

            return user;

        } catch (ExpiredJwtException e) {
            System.out.println("Token has expired: " + e.getMessage());
            return null; // Handle expired token scenario as needed
        } catch (Exception e) {
            System.out.println("Error decoding token: " + e.getMessage());
            return null; // General error handling
        }
    }
}
