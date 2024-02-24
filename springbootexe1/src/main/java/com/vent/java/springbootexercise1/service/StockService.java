package com.vent.java.springbootexercise1.service;

import com.vent.java.springbootexercise1.entity.Company;
import com.vent.java.springbootexercise1.entity.Stock;

public interface StockService {
    Company getCompany(String symbol);
    Stock getStock(String symbol);
}
