package com.thinkswift.balkandate.models.nonentities.response.usermanagement;

import com.thinkswift.balkandate.models.entities.BalkanDateProfileSpecification;
import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

public class BalkanDateProfileSpecResponse extends BalkanDateBaseResponse {
    BalkanDateProfileSpecification balkanDateProfileSpecification;

    public BalkanDateProfileSpecResponse(BalkanDateProfileSpecification balkanDateProfileSpecification) {
        this.balkanDateProfileSpecification = balkanDateProfileSpecification;
    }

    public BalkanDateProfileSpecResponse() {
    }

    public BalkanDateProfileSpecification getBalkanDateProfileSpecification() {
        return balkanDateProfileSpecification;
    }

    public void setBalkanDateProfileSpecification(BalkanDateProfileSpecification balkanDateProfileSpecification) {
        this.balkanDateProfileSpecification = balkanDateProfileSpecification;
    }
}
