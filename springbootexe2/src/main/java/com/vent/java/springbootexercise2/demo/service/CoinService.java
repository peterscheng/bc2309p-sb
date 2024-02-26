package com.vent.java.springbootexercise2.demo.service;

import com.vent.java.springbootexercise2.demo.entity.Coin;

import java.util.List;

public interface CoinService {
    List<Coin> getCoins(String currency, String ids);
}
