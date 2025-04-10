package com.thinkswift.balkandate.models.nonentities.response.usermanagement;

import com.thinkswift.balkandate.models.entities.BalkanDateProfileMedia;
import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

public class BalkanDateMediaUploadResponse extends BalkanDateBaseResponse {
    BalkanDateProfileMedia profileMedia;

    public BalkanDateMediaUploadResponse(BalkanDateProfileMedia profileMedia) {
        this.profileMedia = profileMedia;
    }

    public BalkanDateMediaUploadResponse() {
    }

    public BalkanDateProfileMedia getProfileMedia() {
        return profileMedia;
    }

    public void setProfileMedia(BalkanDateProfileMedia profileMedia) {
        this.profileMedia = profileMedia;
    }

    @Override
    public String toString() {
        return "BalkanDateMediaUploadResponse{" +
                "profileMedia=" + profileMedia +
                ", txnId='" + txnId + '\'' +
                ", txnDate='" + txnDate + '\'' +
                ", txnTime='" + txnTime + '\'' +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
