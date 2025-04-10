package com.thinkswift.balkandate.models.entities;

import com.thinkswift.balkandate.models.nonentities.misc.JsonConverter;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Entity
@Table(name = "balkan_date_profile_specification")
public class BalkanDateProfileSpecification {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    private String id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, length = 1000)
    private String profileBio;

    @Convert(converter = JsonConverter.class)
    @Column(columnDefinition = "TEXT")
    private Map<String, Object> preferences;

    @Convert(converter = JsonConverter.class)
    @Column(columnDefinition = "TEXT")
    private Map<String, Object> profileSpecifications;

    public BalkanDateProfileSpecification(String username) {
        this.username = username;
        this.profileSpecifications = new ConcurrentHashMap<>();
        this.preferences = new ConcurrentHashMap<>();
        this.profileBio = "";
    }

    public BalkanDateProfileSpecification() {
        preferences = new ConcurrentHashMap<>();
        profileSpecifications = new ConcurrentHashMap<>();
        this.profileBio = "";
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfileBio() {
        return profileBio;
    }

    public void setProfileBio(String profileBio) {
        this.profileBio = profileBio;
    }

    public Map<String, Object> getPreferences() {
        return preferences;
    }

    public void setPreferences(Map<String, Object> preferences) {
        this.preferences = preferences;
    }

    public Map<String, Object> getProfileSpecifications() {
        return profileSpecifications;
    }

    public void setProfileSpecifications(Map<String, Object> profileSpecifications) {
        this.profileSpecifications = profileSpecifications;
    }
}
