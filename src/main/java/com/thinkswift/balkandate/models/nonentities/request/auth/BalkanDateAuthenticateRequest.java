package com.thinkswift.balkandate.models.nonentities.request.auth;

/**
 *
 * Author : Sourav Modak
 * Date : 15-Feb-2025
 * Place : Toronto, ON
 */

public class BalkanDateAuthenticateRequest {
    String token;


    public BalkanDateAuthenticateRequest(String token) {
        this.token = token;
    }

    public BalkanDateAuthenticateRequest() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "BalkanDateAuthenticateRequest{" +
                "token='" + token + '\'' +
                '}';
    }
}
