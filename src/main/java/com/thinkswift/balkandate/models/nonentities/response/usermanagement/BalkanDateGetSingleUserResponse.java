package com.thinkswift.balkandate.models.nonentities.response.usermanagement;

import com.thinkswift.balkandate.models.entities.BalkanDateProfileMedia;
import com.thinkswift.balkandate.models.entities.BalkanDateUser;
import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

import java.util.List;

public class BalkanDateGetSingleUserResponse extends BalkanDateBaseResponse {
    BalkanDateUser user;
    List<BalkanDateProfileMedia> media;

    public BalkanDateGetSingleUserResponse(BalkanDateUser user, List<BalkanDateProfileMedia> media) {
        this.user = user;
        this.media = media;
    }

    public BalkanDateGetSingleUserResponse() {
    }

    public BalkanDateUser getUser() {
        return user;
    }

    public void setUser(BalkanDateUser user) {
        this.user = user;
    }

    public List<BalkanDateProfileMedia> getMedia() {
        return media;
    }

    public void setMedia(List<BalkanDateProfileMedia> media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "BalkanDateGetSingleUserResponse{" +
                "user=" + user +
                ", media=" + media +
                ", txnId='" + txnId + '\'' +
                ", txnDate='" + txnDate + '\'' +
                ", txnTime='" + txnTime + '\'' +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
