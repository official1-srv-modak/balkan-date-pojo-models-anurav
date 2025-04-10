package com.thinkswift.balkandate.models.nonentities.response.usermanagement;

import com.thinkswift.balkandate.models.entities.BalkanDateUser;
import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

import java.util.List;

public class BalkanDateGetMultipleUserResponse extends BalkanDateBaseResponse {

    List<BalkanDateUser> users;

    public BalkanDateGetMultipleUserResponse(List<BalkanDateUser> users) {
        this.users = users;
    }

    public BalkanDateGetMultipleUserResponse() {
    }

    public List<BalkanDateUser> getUsers() {
        return users;
    }

    public void setUsers(List<BalkanDateUser> users) {
        this.users = users;
    }
}
