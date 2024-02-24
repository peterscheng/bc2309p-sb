package com.vent.java.springbootexercise1.controller;

import com.vent.java.springbootexercise1.dto.response.StockDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface StockOperation {

    @GetMapping(value="/stock")
    StockDTO getStock(@RequestParam(value = "symbol") String symbol);

}
