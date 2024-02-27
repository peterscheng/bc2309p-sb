package com.vent.java.springbootexercise2.demo.infra;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Syscode {
  OK("000000", "OK."), //
  NOTFOUND("000001", "Resource Not Found."), //
  REST_CLIENT_EXCEPTION("900000", "RestClientException.-Coingecko Service is unavailable"), //
  NULL_POINTER_EXCEPTION("900002", "NPE."), //
  GENERAL_EXCEPTION ("999999", "Unhandled Other Exceptions."), //
  ;

  private String code;
  private String message;

}
