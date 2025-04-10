package com.thinkswift.balkandate.models.nonentities.response.auth;

/**
 *
 * Author : Sourav Modak
 * Date : 15-Feb-2025
 * Place : Toronto, ON
 */

import com.thinkswift.balkandate.models.entities.BalkanDateUser;
import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

public class BalkanDateSignupResponse extends BalkanDateBaseResponse {
    BalkanDateUser user;

    public BalkanDateSignupResponse(BalkanDateUser user) {
        user.setPassword("****");
        this.user = user;
    }

    public BalkanDateSignupResponse() {
    }

    public BalkanDateUser getUser() {
        return user;
    }

    public void setUser(BalkanDateUser user) {
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
