package com.vent.java.springbootexercise1.infra;

import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

public class BcUtil {

  public static String getUrl(Scheme scheme, String domain, String uri) {
    return UriComponentsBuilder.newInstance() //
        .scheme(scheme.toLowerCase()) //
        .host(domain) //
        .path(uri) //
        .toUriString(); // handle special character, \ ://
  }

  public static String getUrl(Scheme scheme, String domain, String uri,String symbol, String token) {
    return UriComponentsBuilder.newInstance() //
            .scheme(scheme.toLowerCase()) //
            .host(domain) //
            .path(uri) //
            .queryParam("symbol",symbol)
            .queryParam("token",token)
            .toUriString(); // handle special character, \ ://
  }
  
}
