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
    private String current_price;
    private String market_cap;
    private String market_cap_rank;
    private String fully_diluted_valuation;
    private String total_volume;
    private String high_24h;
    private String low_24h;

}
