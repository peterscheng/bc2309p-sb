package com.vent.java.springbootexercise2.demo.controller.impl;

import com.vent.java.springbootexercise2.demo.controller.CoinsOperation;
import com.vent.java.springbootexercise2.demo.dto.mapper.CoinMapper;
import com.vent.java.springbootexercise2.demo.dto.reponse.CoinDTO;
import com.vent.java.springbootexercise2.demo.entity.Coin;
import com.vent.java.springbootexercise2.demo.infra.ApiResponse;
import com.vent.java.springbootexercise2.demo.infra.Syscode;
import com.vent.java.springbootexercise2.demo.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/api/v1")
public class CoinsController implements CoinsOperation {

    @Autowired
    private CoinService coinService;

    @Override
    public ApiResponse<List<CoinDTO>> getCoins(String currency, String ids) {
        List<Coin> coins = coinService.getCoins(currency, ids);
        List<CoinDTO> dtos = CoinMapper.map(coins);
        return ApiResponse.<List<CoinDTO>>builder()
                .status(Syscode.OK)
                .data(dtos)
                .build();
    }

}
