package com.thinkswift.balkandate.models.nonentities.request.usermanagement;

public class BalkanDateUpdatePhoneRequest {
    String phoneNumber;

    public BalkanDateUpdatePhoneRequest(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BalkanDateUpdatePhoneRequest() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BalkanDateUpdatePhoneRequest{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
