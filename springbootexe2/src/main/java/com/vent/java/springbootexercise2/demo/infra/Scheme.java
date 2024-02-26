package com.vent.java.springbootexercise2.demo.infra;

public enum Scheme {
  HTTPS, HTTP,;

  public String toLowerCase() {
    return this.name().toLowerCase(); // https or http
  }
}
