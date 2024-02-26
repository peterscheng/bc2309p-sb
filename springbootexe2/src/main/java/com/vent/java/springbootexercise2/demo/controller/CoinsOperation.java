package com.vent.java.springbootexercise2.demo.controller;

import com.vent.java.springbootexercise2.demo.dto.reponse.CoinDTO;
import com.vent.java.springbootexercise2.demo.infra.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CoinsOperation {
    @GetMapping(value = "/coins")
    ApiResponse<List<CoinDTO>> getCoins(@RequestParam(value = "currency") String currency, @RequestParam(value = "ids") String dis);

}
