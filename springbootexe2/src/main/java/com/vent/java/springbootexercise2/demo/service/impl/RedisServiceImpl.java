package com.vent.java.springbootexercise2.demo.service.impl;

import com.vent.java.springbootexercise2.demo.infra.RedisHelper;
import com.vent.java.springbootexercise2.demo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.time.Duration;


@Service
public class RedisServiceImpl implements RedisService {



  @Autowired
  private RedisHelper redisHelper;

  @Override
  public void saveCoins(String key, Object values)
      throws JsonProcessingException {
    redisHelper.set(key, values);

  }
  @Override
  public void saveCoins(String key, Object values, Duration duration)
          throws JsonProcessingException {
    redisHelper.set(key, values,duration);

  }
}
