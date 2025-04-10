package com.thinkswift.balkandate.models.nonentities.response.usermanagement;

import com.thinkswift.balkandate.models.entities.BalkanDateProfileMedia;
import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

import java.util.ArrayList;
import java.util.List;

public class BalkanDateGetUserMediaListResponse extends BalkanDateBaseResponse {
    List<BalkanDateProfileMedia> media;

    public BalkanDateGetUserMediaListResponse() {
    }

    public BalkanDateGetUserMediaListResponse(List<BalkanDateProfileMedia> media) {
        this.media = media;
    }

    public List<BalkanDateProfileMedia> getMedia() {
        return media;
    }

    public void setMedia(List<BalkanDateProfileMedia> media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "BalkanDateGetUserMediaListResponse{" +
                "media=" + media +
                ", txnId='" + txnId + '\'' +
                ", txnDate='" + txnDate + '\'' +
                ", txnTime='" + txnTime + '\'' +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
