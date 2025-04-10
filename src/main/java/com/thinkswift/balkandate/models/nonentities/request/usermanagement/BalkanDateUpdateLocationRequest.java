package com.thinkswift.balkandate.models.nonentities.request.usermanagement;

public class BalkanDateUpdateLocationRequest {
    String location;

    public BalkanDateUpdateLocationRequest(String location) {
        this.location = location;
    }

    public BalkanDateUpdateLocationRequest() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "BalkanDateUpdateLocationRequest{" +
                "location='" + location + '\'' +
                '}';
    }
}
