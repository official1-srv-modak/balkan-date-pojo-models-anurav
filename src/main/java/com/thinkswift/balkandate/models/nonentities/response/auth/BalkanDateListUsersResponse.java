package com.thinkswift.balkandate.models.nonentities.response.auth;
/**
 *
 * Author : Sourav Modak
 * Date : 15-Feb-2025
 * Place : Toronto, ON
 */

import com.thinkswift.balkandate.models.entities.BalkanDateUser;
import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

import java.util.ArrayList;
import java.util.List;

public class BalkanDateListUsersResponse extends BalkanDateBaseResponse {
    List<BalkanDateUser> users;

    public BalkanDateListUsersResponse()
    {
        users = new ArrayList<>();
    }

    public List<BalkanDateUser> getUsers() {
        return users;
    }

    public void setUsers(List<BalkanDateUser> users) {
        users.forEach(user->user.setPassword("***"));
        this.users = users;
    }

    @Override
    public String toString() {
        return "BalkanDateListUsersResponse{" +
                "users=" + users +
                ", txnId='" + txnId + '\'' +
                ", txnDate='" + txnDate + '\'' +
                ", txnTime='" + txnTime + '\'' +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
