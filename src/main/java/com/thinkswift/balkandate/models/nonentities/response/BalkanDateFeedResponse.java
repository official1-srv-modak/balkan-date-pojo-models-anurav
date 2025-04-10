package com.thinkswift.balkandate.models.nonentities.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;


public class BalkanDateFeedResponse<T> extends BalkanDateBaseResponse{
    private T data;
    public BalkanDateFeedResponse() {

    }
    public BalkanDateFeedResponse(T data, HttpStatus status, String message) {
        this.status = status;
        this.message = message;
        this.data = data;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(this);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}"; // Fallback in case of an exception
        }
    }
}
