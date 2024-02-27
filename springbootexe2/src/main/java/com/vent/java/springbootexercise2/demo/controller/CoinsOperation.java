package com.vent.java.springbootexercise2.demo.controller;

import com.vent.java.springbootexercise2.demo.annotation.CoinIdCheck;
import com.vent.java.springbootexercise2.demo.annotation.CurrencyCheck;
import com.vent.java.springbootexercise2.demo.dto.reponse.CoinDTO;
import com.vent.java.springbootexercise2.demo.dto.request.CurrencyDTO;
import com.vent.java.springbootexercise2.demo.infra.ApiResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Validated
public interface CoinsOperation {
    @GetMapping(value = "/coins")
    ApiResponse<List<CoinDTO>> getCoins(@CurrencyCheck @RequestParam(value = "currency") CurrencyDTO currency, @CoinIdCheck @RequestParam(value = "ids") String dis);

}
