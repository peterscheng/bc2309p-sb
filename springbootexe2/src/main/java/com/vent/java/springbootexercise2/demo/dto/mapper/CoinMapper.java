package com.vent.java.springbootexercise2.demo.dto.mapper;

import com.vent.java.springbootexercise2.demo.dto.reponse.CoinDTO;
import com.vent.java.springbootexercise2.demo.entity.Coin;

import java.util.List;
import java.util.stream.Collectors;

public class CoinMapper {
    public static CoinDTO map(Coin coin){
        CoinDTO coinDTO=   CoinDTO.builder()
                .id(coin.getId())
                .symbol(coin.getSymbol())
                .name(coin.getName())
                .image(coin.getImage())
                .market_cap(coin.getMarket_cap())
                .market_cap_rank(coin.getMarket_cap_rank())
                .fully_diluted_valuation(coin.getFully_diluted_valuation())
                .total_volume(coin.getTotal_volume())
                .low_24h(coin.getLow_24h())
                .price_change_24h(coin.getPrice_change_24h())
                .price_change_percentage_24h(coin.getPrice_change_percentage_24h())
                .market_cap_change_24h(coin.getMarket_cap_change_24h())
                .market_cap_change_percentage_24h(coin.getMarket_cap_change_percentage_24h())
                .total_supply(coin.getTotal_supply())
                .max_supply(coin.getMax_supply())
                .ath(coin.getAth())
                .atl_date(coin.getAtl_date())
                .last_updated(coin.getLast_updated())
                .roi(coin.getRoi())
                .ath_change_percentage(coin.getAth_change_percentage())
                .ath_date(coin.getAth_date())
                .atl(coin.getAtl())
                .atl_change_percentage(coin.getAtl_change_percentage())
                .circulating_supply(coin.getCirculating_supply())
                .current_price(coin.getCurrent_price())
                .fully_diluted_valuation(coin.getFully_diluted_valuation())
                .high_24h(coin.getHigh_24h())
                .build();
        return coinDTO;
    }

    public static List<CoinDTO> map(List<Coin> coins){
        List<CoinDTO> list=  coins.stream()
                .map(c ->{
                    return CoinMapper.map(c);
                }).collect(Collectors.toList());
        return list;
    }
}
