package com.thinkswift.balkandate.models.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "balkan_date_profile_media")
public class BalkanDateProfileMedia {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    private String id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String mediaUrl;

    @Column(nullable = false)
    private boolean hidden = false;

    @Column(nullable = false)
    private String mediaType;

    @Column
    private String uploadTimeStamp;

    @PrePersist
    public void prePersist() {
        this.uploadTimeStamp = ZonedDateTime.now(ZoneOffset.UTC).toString();
    }

    public BalkanDateProfileMedia() {
    }

    public BalkanDateProfileMedia(String username, String mediaUrl, String mediaType) {
        this.username = new String(username);
        this.mediaUrl = mediaUrl;
        this.mediaType = mediaType;
        this.hidden = false;
    }

    public BalkanDateProfileMedia(BalkanDateProfileMedia media) {
        this.id = media.getId();
        this.username = new String(media.getUsername());
        this.mediaUrl = media.getMediaUrl();
        this.mediaType = media.getMediaType();
        this.hidden = media.isHidden();
    }


    public String getUploadTimeStamp() {
        return uploadTimeStamp;
    }

    public void setUploadTimeStamp(String uploadTimeStamp) {
        this.uploadTimeStamp = uploadTimeStamp;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return new String(username);
    }

    public void setUsername(String username) {
        this.username = new String(username);
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    @Override
    public String toString() {
        return "BalkanDateProfileMedia{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", mediaUrl='" + mediaUrl + '\'' +
                ", hidden=" + hidden +
                '}';
    }
}

