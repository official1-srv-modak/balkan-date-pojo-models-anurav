package com.thinkswift.balkandate.models.repo;

import com.thinkswift.balkandate.models.entities.BalkanDateUser;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BalkanDateUserRepo extends JpaRepository<BalkanDateUser, Long> {

    BalkanDateUser findByUsername(String username);
    public List<BalkanDateUser> findAll();

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("select u from BalkanDateUser u where u.username = :username")
    Optional<BalkanDateUser> findByUsernameWithLock(@Param("username") String username);


//    default BalkanDateUser findByUsernameMasked(String username) {
//        BalkanDateUser user = findByUsername(username);
//        if (user != null) {
//            user.setPassword("****");
//        }
//        return user;
//    }
//    default BalkanDateUser save(BalkanDateUser user) {
//        if(user.getPassword().equals("****"))
//        {
//            BalkanDateUser newUser = findByUsername(user.getUsername());
//            user.setPassword(newUser.getPassword());
//        }
//        BalkanDateUser fromRepo = saveAndFlush(user);
//        if (fromRepo != null) {
//            BalkanDateUser maskedUser = new BalkanDateUser(fromRepo); // Copy constructor
//            maskedUser.setPassword("****");
//            return maskedUser;
//        }
//        return null;
//    }


}
