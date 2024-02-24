package com.vent.java.springbootexercise1.entity;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@ToString
public class Company implements Serializable {
    private String country;
    private String currency;
    private String exchange;
    private String ipoDate;
    private int marketCapitalization;
    private String name;
    private String phone;
    private int shareOutstanding;
    private String ticker;
    private String weburl;
    private String logo;
    private String finnhubIndustry;


}
