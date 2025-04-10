package com.thinkswift.balkandate.models.nonentities.response.auth;

/**
 *
 * Author : Sourav Modak
 * Date : 15-Feb-2025
 * Place : Toronto, ON
 */

import com.thinkswift.balkandate.models.entities.BalkanDateUser;
import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

public class BalkanDateAuthenticateResponse extends BalkanDateBaseResponse {
    BalkanDateUser user;
    String token;

    public BalkanDateAuthenticateResponse() {
    }

    public BalkanDateAuthenticateResponse(BalkanDateUser user, String token) {
        this.user = user;
        this.token = token;
    }

    public BalkanDateUser getUser() {
        return user;
    }

    public void setUser(BalkanDateUser user) {
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
