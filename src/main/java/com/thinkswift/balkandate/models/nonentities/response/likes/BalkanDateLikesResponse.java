package com.thinkswift.balkandate.models.nonentities.response.likes;

import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

public class BalkanDateLikesResponse extends BalkanDateBaseResponse {
    String from, to;
    String likesTimestamp;
    public BalkanDateLikesResponse() {

    }

    public String getLikesTimestamp() {
        return likesTimestamp;
    }

    public void setLikesTimestamp(String likesTimestamp) {
        this.likesTimestamp = likesTimestamp;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
