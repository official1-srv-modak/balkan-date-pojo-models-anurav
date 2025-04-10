package com.thinkswift.balkandate.models.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Entity
@IdClass(BalkanDateLike.LikeId.class)
@Table(
        name = "balkan_date_likes",
        uniqueConstraints = @UniqueConstraint(columnNames = {"liker_username", "liked_username"})
)
public class BalkanDateLike {

    @Id
    @Column(name = "liker_username", nullable = false)
    private String likerUsername;

    @Id
    @Column(name = "liked_username", nullable = false)
    private String likedUsername;

    @Column(name = "created_at", nullable = false)
    private String createdAt;

    // Set UTC time when persisting
    @PrePersist
    protected void onCreate() {
        this.createdAt = String.valueOf(LocalDateTime.now().atOffset(ZoneOffset.UTC));
    }

    // Composite Key class
    public static class LikeId implements Serializable {
        private String likerUsername;
        private String likedUsername;

        public LikeId() {}

        public LikeId(String likerUsername, String likedUsername) {
            this.likerUsername = likerUsername;
            this.likedUsername = likedUsername;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof LikeId)) return false;
            LikeId that = (LikeId) o;
            return likerUsername.equals(that.likerUsername) && likedUsername.equals(that.likedUsername);
        }

        @Override
        public int hashCode() {
            return likerUsername.hashCode() + likedUsername.hashCode();
        }
    }

    // Getters and Setters
    public String getLikerUsername() {
        return likerUsername;
    }

    public void setLikerUsername(String likerUsername) {
        this.likerUsername = likerUsername;
    }

    public String getLikedUsername() {
        return likedUsername;
    }

    public void setLikedUsername(String likedUsername) {
        this.likedUsername = likedUsername;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
