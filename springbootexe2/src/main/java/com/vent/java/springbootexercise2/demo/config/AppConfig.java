package com.vent.java.springbootexercise2.demo.config;

import com.vent.java.springbootexercise2.demo.infra.RedisHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;


@Configuration
public class AppConfig {

  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }


  @Bean
  ObjectMapper objectMapper() {
    return new ObjectMapper();
  }


  @Bean
  RedisHelper redisHelper(RedisConnectionFactory factory,
                          ObjectMapper objectMapper) {
    return new RedisHelper(factory, objectMapper);
  }
}
