package com.thinkswift.balkandate.models.nonentities.request.usermanagement;

import com.thinkswift.balkandate.models.entities.BalkanDateProfileSpecification;

import java.util.Map;

public class BalkanDateUpdateProfileSpecRequest {
    BalkanDateProfileSpecification balkanDateProfileSpecification;

    public BalkanDateUpdateProfileSpecRequest(BalkanDateProfileSpecification balkanDateProfileSpecification) {
        this.balkanDateProfileSpecification = balkanDateProfileSpecification;
    }

    public BalkanDateUpdateProfileSpecRequest() {
    }

    public BalkanDateProfileSpecification getBalkanDateProfileSpecification() {
        return balkanDateProfileSpecification;
    }

    public void setBalkanDateProfileSpecification(BalkanDateProfileSpecification balkanDateProfileSpecification) {
        this.balkanDateProfileSpecification = balkanDateProfileSpecification;
    }
}
