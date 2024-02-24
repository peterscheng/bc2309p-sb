package com.vent.java.springbootexercise1.dto.response.mapper;

import com.vent.java.springbootexercise1.dto.response.CompanyDTO;
import com.vent.java.springbootexercise1.dto.response.StockDTO;
import com.vent.java.springbootexercise1.entity.Company;
import com.vent.java.springbootexercise1.entity.Stock;

public class StockMapper {
    public static StockDTO map(Company company, Stock stock) {
        CompanyDTO companyDTO = CompanyDTO.builder()
                .country(company.getCountry())
                .companyName(company.getName())
                .ipoDate(company.getIpoDate())
                .logo(company.getLogo())
                .marketCap(company.getMarketCapitalization())
                .currency(company.getCurrency())
                .build();
        StockDTO stockDTO = StockDTO.builder()
                .companyProfile(companyDTO)
                .currentPrice(stock.getC())
                .dayHigh(stock.getH())
                .dayLow(stock.getL())
                .dayOpen(stock.getO())
                .prevDayClose(stock.getPc())
                .build();

        return stockDTO;
    }
}
