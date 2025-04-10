package com.thinkswift.balkandate.models.nonentities.response.auth;


import com.thinkswift.balkandate.models.entities.BalkanDateServerUser;
import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

public class BalkanDateServerSignupResponse extends BalkanDateBaseResponse {
    BalkanDateServerUser user;

    public BalkanDateServerSignupResponse(BalkanDateServerUser user) {
        user.setPassword("****");
        this.user = user;
    }

    public BalkanDateServerSignupResponse() {
    }

    public BalkanDateServerUser getUser() {
        return user;
    }

    public void setUser(BalkanDateServerUser user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "BalkanDateSignupResponse{" +
                "user=" + user +
                ", txnId='" + txnId + '\'' +
                ", txnDate='" + txnDate + '\'' +
                ", txnTime='" + txnTime + '\'' +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
