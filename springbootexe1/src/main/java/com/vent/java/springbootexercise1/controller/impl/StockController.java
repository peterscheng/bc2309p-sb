package com.vent.java.springbootexercise1.controller.impl;

import com.vent.java.springbootexercise1.controller.StockOperation;
import com.vent.java.springbootexercise1.dto.response.StockDTO;
import com.vent.java.springbootexercise1.dto.response.mapper.StockMapper;
import com.vent.java.springbootexercise1.entity.Company;
import com.vent.java.springbootexercise1.entity.Stock;
import com.vent.java.springbootexercise1.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1")
public class StockController implements StockOperation {

    @Autowired
    private StockService stockService;

    @Override
    public StockDTO getStock(String symbol){
        Company company= stockService.getCompany(symbol);
        Stock stock=stockService.getStock(symbol);
        StockDTO stockDTO= StockMapper.map(company,stock);

        return stockDTO;
    }
}
