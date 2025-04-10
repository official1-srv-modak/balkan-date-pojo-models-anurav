package com.thinkswift.balkandate.models.entities;

import jakarta.persistence.*;
import java.util.UUID;

import java.util.Date;

/**
 *
 * Author : Sourav Modak
 * Date : 15-Feb-2025
 * Place : Toronto, ON
 */

@Entity
@Table(name = "balkandate_user")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BalkanDateUser {

    @Id
    private String id;

    @Column(unique = true, nullable = false)
    String username;
    String password;
    String firstName, lastName, role;
    Date joined;
    String profilePicture;
    String profileMediaUrl;
    String profileMediaType;
    String email, phone;
    boolean active;
    String gender;
    String location;
    Date birthday;
    boolean verifiedBot;
    boolean newUser;

    public BalkanDateUser(BalkanDateUser fromRepo) {
        this.id = fromRepo.getId();
        this.username = fromRepo.getUsername();
        this.password = fromRepo.getPassword();
        this.firstName = fromRepo.getFirstName();
        this.lastName = fromRepo.getLastName();
        this.role = fromRepo.getRole();
        this.joined = fromRepo.getJoined();
        this.profileMediaUrl = fromRepo.getProfileMediaUrl();
        this.email = fromRepo.getEmail();
        this.phone = fromRepo.getPhone();
        this.active = fromRepo.isActive();
        this.gender = fromRepo.getGender();
        this.location = fromRepo.getLocation();
        this.birthday = fromRepo.getBirthday();
        this.profilePicture = fromRepo.getProfilePicture();
        this.profileMediaType = fromRepo.getProfileMediaType();
        this.verifiedBot = fromRepo.isVerifiedBot();
        this.newUser = fromRepo.isNewUser();
    }
    // think how to add preferences

    @PrePersist
    protected void onCreate() {
        this.id = UUID.randomUUID().toString();
    }

    public BalkanDateUser() {
        joined = new Date();
        active = true;
        this.verifiedBot = false;
        this.newUser = true;
    }

    public BalkanDateUser(String id, String username, String password, String firstName, String lastName, String role, String profileMediaUrl, String email, String phone, String gender, String location, Date birthday, String profilePicture, String profileMediaType) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.profileMediaUrl = profileMediaUrl;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.location = location;
        this.birthday = birthday;
        this.profilePicture = profilePicture;
        this.profileMediaType = profileMediaType;
        this.verifiedBot = false;

        joined = new Date();
        active = true;
        this.newUser = true;
    }

    public boolean isNewUser() {
        return newUser;
    }

    public void setNewUser(boolean newUser) {
        this.newUser = newUser;
    }

    public boolean isVerifiedBot() {
        return verifiedBot;
    }

    public void setVerifiedBot(boolean verified) {
        this.verifiedBot = verified;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getJoined() {
        return joined;
    }

    public void setJoined(Date joined) {
        this.joined = joined;
    }

    public String getProfileMediaUrl() {
        return profileMediaUrl;
    }

    public void setProfileMediaUrl(String profileMediaUrl) {
        this.profileMediaUrl = profileMediaUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "BalkanDateUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", joined=" + joined +
                ", profilePicture='" + profilePicture + '\'' +
                ", profileMediaUrl='" + profileMediaUrl + '\'' +
                ", profileMediaType='" + profileMediaType + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", active=" + active +
                ", gender='" + gender + '\'' +
                ", location='" + location + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
