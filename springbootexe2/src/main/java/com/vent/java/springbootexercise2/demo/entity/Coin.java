package com.vent.java.springbootexercise2.demo.entity;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@ToString
public class Coin implements Serializable {
    private String id;
    private String symbol;
    private String name;
    private String image;
    private int current_price;
    private Long market_cap;
    private Long market_cap_rank;
    private Long fully_diluted_valuation;
    private Long total_volume;
    private int high_24h;
    private int low_24h;
    private int price_change_24h;
    private int price_change_percentage_24h;
    private Long market_cap_change_24h;
    private Long market_cap_change_percentage_24h;
    private int circulating_supply;
    private int total_supply;
    private int max_supply;
    private int ath;
    private int ath_change_percentage;
    private String ath_date;
    private int atl;
    private Long atl_change_percentage;
    private String atl_date;
    private ROI roi;
    private String last_updated;
}
