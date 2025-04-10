package com.thinkswift.balkandate.models.nonentities.response.auth;

/**
 *
 * Author : Sourav Modak
 * Date : 15-Feb-2025
 * Place : Toronto, ON
 */
import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

public class BalkanDateLoginResponse extends BalkanDateBaseResponse {
    String token;

    public BalkanDateLoginResponse() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
