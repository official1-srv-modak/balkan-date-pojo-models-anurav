package com.thinkswift.balkandate.models.nonentities.response.auth;


import com.thinkswift.balkandate.models.entities.BalkanDateServerUser;
import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

import java.util.ArrayList;
import java.util.List;

public class BalkanDateListServerUsersResponse extends BalkanDateBaseResponse {
    List<BalkanDateServerUser> users;

    public BalkanDateListServerUsersResponse()
    {
        users = new ArrayList<>();
    }

    public List<BalkanDateServerUser> getUsers() {
        return users;
    }

    public void setUsers(List<BalkanDateServerUser> users) {
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
