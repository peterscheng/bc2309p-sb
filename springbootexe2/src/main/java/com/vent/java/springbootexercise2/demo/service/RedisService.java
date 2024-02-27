package com.vent.java.springbootexercise2.demo.service;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.time.Duration;
import java.util.Objects;


public interface RedisService {

  void saveCoins(String key, Object values) throws JsonProcessingException;
  void saveCoins(String key, Object values, Duration duration) throws JsonProcessingException;
}
