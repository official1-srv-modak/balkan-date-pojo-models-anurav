package com.thinkswift.balkandate.models.nonentities.request.usermanagement;

public class BalkanDateUpdateProfilePicRequest {
    String profilePicUrl;

    public BalkanDateUpdateProfilePicRequest(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public BalkanDateUpdateProfilePicRequest() {
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    @Override
    public String toString() {
        return "BalkanDateUpdateProfilePicRequest{" +
                "profilePicUrl='" + profilePicUrl + '\'' +
                '}';
    }
}
