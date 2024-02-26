package com.vent.java.springbootexercise2.demo.infra;

import org.springframework.web.util.UriComponentsBuilder;

public class BcUtil {

  public static String getUrl(Scheme scheme, String domain, String uri) {
    return UriComponentsBuilder.newInstance() //
        .scheme(scheme.toLowerCase()) //
        .host(domain) //
        .path(uri) //
        .toUriString(); // handle special character, \ ://
  }

  public static String getUrl(Scheme scheme, String domain, String uri,String currency,String ids, String token) {
    return UriComponentsBuilder.newInstance() //
            .scheme(scheme.toLowerCase()) //
            .host(domain) //
            .path(uri) //
            .queryParam("vs_currency",currency)
            .queryParam("ids",ids)
            .queryParam("x_cg_demo_api_key",token)
            .toUriString(); // handle special character, \ ://
  }
  
}
