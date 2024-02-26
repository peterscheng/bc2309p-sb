package com.vent.java.springbootexercise2.demo.exception;

import com.vent.java.springbootexercise2.demo.infra.ApiResponse;
import com.vent.java.springbootexercise2.demo.infra.Syscode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestClientException;



@RestControllerAdvice // Bean
public class GlobalExceptionHandler {

  @ExceptionHandler(RestClientException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)  // http status code
  public ApiResponse<Void> restclientExceptionHandler() {
    return ApiResponse.<Void>builder() //
        .status(Syscode.REST_CLIENT_EXCEPTION) //
        .data(null) //
        .build();
  }

  @ExceptionHandler(NullPointerException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public ApiResponse<Void> npeExceptionHandler() {
    return ApiResponse.<Void>builder() //
        .status(Syscode.NULL_POINTER_EXCEPTION) //
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
