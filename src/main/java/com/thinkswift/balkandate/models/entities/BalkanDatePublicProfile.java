package com.thinkswift.balkandate.models.entities;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thinkswift.balkandate.models.nonentities.misc.JsonConverter;
import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import java.io.IOException;
import java.util.*;

@Entity
@Immutable  // Ensures the entity is read-only
@Subselect(
        """
        SELECT
            u.id,
            u.username,
            u.first_name,
            u.last_name,
            u.joined,
            u.profile_picture,
            u.profile_media_url,
            u.gender,
            u.location,
            u.birthday,
            u.profile_media_type,
            COALESCE(ps.profile_bio, '') AS profile_bio,
            COALESCE(ps.preferences, '{}') AS preferences,
            COALESCE(ps.profile_specifications, '{}') AS profile_specifications,
            COALESCE(
                CONCAT('[', GROUP_CONCAT(
                    DISTINCT JSON_OBJECT(
                        'id', pm.id,
                        'media_url', pm.media_url,
                        'media_type', pm.media_type,
                        'hidden', pm.hidden = 1
                    ) SEPARATOR ','
                ), ']')
            , '[]') AS media_urls
        FROM
            balkandate_user u
        LEFT JOIN
            balkan_date_profile_specification ps
            ON u.username = ps.username
        LEFT JOIN
            balkan_date_profile_media pm
            ON u.username = pm.username
            AND pm.hidden = 0
        GROUP BY
            u.id, u.username, u.first_name, u.last_name, u.joined,
            u.profile_media_url, u.gender, u.location, u.birthday,
            ps.profile_bio, ps.preferences, ps.profile_specifications
        """
)
public class BalkanDatePublicProfile {

    @Id
    private String id;

    private String username;
    private String firstName, lastName;
    private Date joined;
    private String profileMediaUrl;
    private String profilePicture;
    private String profileMediaType;

    private String gender;
    private String location;
    private Date birthday;

    @Column(length = 1000)
    private String profileBio;

    @Convert(converter = JsonConverter.class)
    @Column(columnDefinition = "TEXT")
    private Map<String, Object> preferences;

    @Convert(converter = JsonConverter.class)
    @Column(columnDefinition = "TEXT")
    private Map<String, Object> profileSpecifications;

    @Column(name = "media_urls")
    private String mediaUrls; // Stores media URLs as a comma-separated string

    @Transient
    private List<Map<String, String>> profileMediaList;

    public void setProfileMediaList(List<Map<String, String>> profileMediaList) {
        this.profileMediaList = profileMediaList;
    }

    public List<Map<String, String>> getProfileMediaList() {
        return profileMediaList;
    }

    @PostLoad
    private void parseMediaList() {
        if (mediaUrls != null && !mediaUrls.isEmpty() && !mediaUrls.equals("[]")) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                profileMediaList = objectMapper.readValue(mediaUrls, new com.fasterxml.jackson.core.type.TypeReference<List<Map<String, String>>>() {});
            } catch (IOException e) {
                System.out.println("Error parsing media JSON array: " + mediaUrls + " - " + e.getMessage());
                profileMediaList = new ArrayList<>();
            }
        } else {
            profileMediaList = new ArrayList<>();
        }
    }

    public String getProfileMediaType() {
        return profileMediaType;
    }

    public void setProfileMediaType(String profileMediaType) {
        this.profileMediaType = profileMediaType;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    // Getters and setters for all fields
    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getJoined() {
        return joined;
    }

    public String getProfileMediaUrl() {
        return profileMediaUrl;
    }

    public String getGender() {
        return gender;
    }

    public String getLocation() {
        return location;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getProfileBio() {
        return profileBio;
    }

    public Map<String, Object> getPreferences() {
        return preferences;
    }

    public Map<String, Object> getProfileSpecifications() {
        return profileSpecifications;
    }
}
