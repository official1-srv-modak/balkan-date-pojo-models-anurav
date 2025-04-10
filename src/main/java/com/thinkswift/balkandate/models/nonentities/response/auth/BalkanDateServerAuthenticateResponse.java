package com.thinkswift.balkandate.models.nonentities.response.auth;


import com.thinkswift.balkandate.models.entities.BalkanDateServerUser;
import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

public class BalkanDateServerAuthenticateResponse extends BalkanDateBaseResponse {
    BalkanDateServerUser user;
    String token;

    public BalkanDateServerAuthenticateResponse() {
    }

    public BalkanDateServerAuthenticateResponse(BalkanDateServerUser user, String token) {
        this.user = user;
        this.token = token;
    }

    public BalkanDateServerUser getUser() {
        return user;
    }

    public void setUser(BalkanDateServerUser user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "BalkanDateAuthenticateResponse{" +
                "user=" + user +
                ", txnId='" + txnId + '\'' +
                ", txnDate='" + txnDate + '\'' +
                ", txnTime='" + txnTime + '\'' +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
