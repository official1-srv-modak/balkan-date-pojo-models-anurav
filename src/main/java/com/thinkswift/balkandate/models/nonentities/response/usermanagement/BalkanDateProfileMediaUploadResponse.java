package com.thinkswift.balkandate.models.nonentities.response.usermanagement;

import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

public class BalkanDateProfileMediaUploadResponse extends BalkanDateBaseResponse {
    String username;
    String url;

    public BalkanDateProfileMediaUploadResponse(String username, String url) {
        this.username = username;
        this.url = url;
    }

    public BalkanDateProfileMediaUploadResponse() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "BalkanDateProfilePicUploadResponse{" +
                "username='" + username + '\'' +
                ", profileMediaUrl='" + url + '\'' +
                ", txnId='" + txnId + '\'' +
                ", txnDate='" + txnDate + '\'' +
                ", txnTime='" + txnTime + '\'' +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
