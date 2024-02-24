package com.vent.java.springbootexercise1.exception;

import com.vent.java.springbootexercise1.infra.ApiResponse;
import com.vent.java.springbootexercise1.infra.Syscode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestClientException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RestClientException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)  // http status code
    public ApiResponse<Void> restclientExceptionHandler() {
        return ApiResponse.<Void>builder() //
                .status(Syscode.REST_CLIENT_EXCEPTION) //
                .data(null) //
                .build();
    }
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ApiResponse<String> exceptionHandler(Exception e) {
        return ApiResponse.<String>builder() //
                .status(Syscode.GENERAL_EXCEPTION) //
                .data(e.getMessage()) //
                .build();
    }
}
