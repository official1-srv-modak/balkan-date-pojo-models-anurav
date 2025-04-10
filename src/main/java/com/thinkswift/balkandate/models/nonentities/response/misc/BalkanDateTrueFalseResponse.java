package com.thinkswift.balkandate.models.nonentities.response.misc;

import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

public class BalkanDateTrueFalseResponse extends BalkanDateBaseResponse {
    Boolean result;

    public BalkanDateTrueFalseResponse(Boolean result) {
        this.result = result;
    }

    public BalkanDateTrueFalseResponse() {
        result = false;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "BalkanDateTrueFalseResponse{" +
                "result=" + result +
                '}';
    }
}
