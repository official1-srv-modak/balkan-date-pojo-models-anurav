package com.thinkswift.balkandate.models.nonentities.response.misc;

import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

public class BalkanDateSingleObjectCommonResponse extends BalkanDateBaseResponse {
    Object data;

    public BalkanDateSingleObjectCommonResponse(Object data) {
        this.data = data;
    }

    public BalkanDateSingleObjectCommonResponse() {
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
