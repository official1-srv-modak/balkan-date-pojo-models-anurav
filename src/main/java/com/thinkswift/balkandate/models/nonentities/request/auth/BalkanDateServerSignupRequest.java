package com.thinkswift.balkandate.models.nonentities.request.auth;


import com.thinkswift.balkandate.models.entities.BalkanDateServerUser;

public class BalkanDateServerSignupRequest {

    BalkanDateServerUser user;

    public BalkanDateServerSignupRequest() {
    }

    public BalkanDateServerSignupRequest(BalkanDateServerUser user) {
        this.user = user;
    }

    public BalkanDateServerUser getUser() {
        return user;
    }

    public void setUser(BalkanDateServerUser user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "BalkanDateSignupRequest{" +
                "user=" + user +
                '}';
    }
}
