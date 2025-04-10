package com.thinkswift.balkandate.models.nonentities.misc;

import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BalkanDateGlobalExceptionHandler {

    // Handling a specific exception
    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<BalkanDateBaseResponse> handleNullPointerException(NullPointerException ex) {
        BalkanDateBaseResponse response = new BalkanDateBaseResponse();
        response.setStatus(HttpStatus.BAD_REQUEST);
        response.setMessage("Null value encountered: " + ex.getMessage());
        return new ResponseEntity<>(response, response.getStatus());
    }

    // Handling a generic exception
    @ExceptionHandler(Exception.class)
    public ResponseEntity<BalkanDateBaseResponse> handleGenericException(Exception ex) {
        BalkanDateBaseResponse response = new BalkanDateBaseResponse();
        response.setStatus(HttpStatus.BAD_REQUEST);
        response.setMessage("An error occurred: " + ex.getMessage());
        return new ResponseEntity<>(response, response.getStatus());
    }
}
