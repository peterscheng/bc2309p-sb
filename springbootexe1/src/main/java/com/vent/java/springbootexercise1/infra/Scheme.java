package com.vent.java.springbootexercise1.infra;

public enum Scheme {
  HTTPS, HTTP,;

  public String toLowerCase() {
    return this.name().toLowerCase(); // https or http
  }
}
