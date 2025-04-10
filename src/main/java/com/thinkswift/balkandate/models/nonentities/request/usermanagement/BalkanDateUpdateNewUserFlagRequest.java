package com.thinkswift.balkandate.models.nonentities.request.usermanagement;

public class BalkanDateUpdateNewUserFlagRequest {

    String newUserFlag;
    String username;

    public BalkanDateUpdateNewUserFlagRequest(String newUserFlag, String username) {
        this.newUserFlag = newUserFlag;
        this.username = username;
    }

    public BalkanDateUpdateNewUserFlagRequest() {
    }

    public String getNewUserFlag() {
        return newUserFlag;
    }

    public void setNewUserFlag(String newUserFlag) {
        this.newUserFlag = newUserFlag;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
