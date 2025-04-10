package com.thinkswift.balkandate.models.nonentities.request.usermanagement;


public class BalkanDateUpdateNameRequest {
    String firstName;
    String lastName;

    public BalkanDateUpdateNameRequest(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public BalkanDateUpdateNameRequest() {
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

    @Override
    public String toString() {
        return "BalkanDateUpdateNameRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
