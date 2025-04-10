package com.thinkswift.balkandate.models.nonentities.request.auth;

/**
 *
 * Author : Sourav Modak
 * Date : 15-Feb-2025
 * Place : Toronto, ON
 */

import com.thinkswift.balkandate.models.entities.BalkanDateUser;
import com.thinkswift.balkandate.models.values.BalkanDateSpecGender;
import com.thinkswift.balkandate.models.values.BalkanDateRoles;

import java.util.Date;

public class BalkanDateSignupRequest {

    String email;
    String password;
    String firstName;
    String lastName;
    String phone;
    String gender;
    Date birthday;
    String initialLocation;

    public BalkanDateSignupRequest() {
    }

    public BalkanDateSignupRequest(BalkanDateUser user) {
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.phone = user.getPhone();
        this.gender = user.getGender();
        this.birthday = user.getBirthday();
        this.initialLocation = user.getLocation();
    }



    public BalkanDateSignupRequest(String email, String password, String firstName, String lastName, String phone, String gender, Date birthday, String initialLocation) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.gender = gender;
        this.birthday = birthday;
        this.initialLocation = initialLocation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getInitialLocation() {
        return initialLocation;
    }

    public void setInitialLocation(String initialLocation) {
        this.initialLocation = initialLocation;
    }

    public BalkanDateUser getBalkanDateUser() {
        BalkanDateUser user = new BalkanDateUser();
        user.setUsername(email);
        user.setEmail(email);
        user.setPassword("****");
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPhone(phone);
        user.setGender(gender);
        user.setBirthday(birthday);
        user.setActive(true);
        user.setLocation(initialLocation);
        user.setRole(BalkanDateRoles.USER.getValue());
        return user;
    }
}
