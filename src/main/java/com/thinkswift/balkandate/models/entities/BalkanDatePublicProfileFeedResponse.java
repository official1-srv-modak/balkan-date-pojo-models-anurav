package com.thinkswift.balkandate.models.entities;

import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

import java.util.List;

public class BalkanDatePublicProfileFeedResponse extends BalkanDateBaseResponse {
    private Object profiles;

    public BalkanDatePublicProfileFeedResponse(List<BalkanDatePublicProfile> profiles) {
        this.profiles = profiles;
    }

    public BalkanDatePublicProfileFeedResponse() {
    }

    public Object getProfiles() {
        return profiles;
    }

    public void setProfiles(Object profiles) {
        this.profiles = profiles;
    }

    @Override
    public String toString() {
        return "BalkanDatePublicProfileFeedResponse{" +
                "profiles=" + profiles +
                ", txnId='" + txnId + '\'' +
                ", txnDate='" + txnDate + '\'' +
                ", txnTime='" + txnTime + '\'' +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
