package com.vent.java.springbootexercise1.dto.response;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CompanyDTO {
    private String country;
    private String companyName;
    private String ipoDate;
    private String logo;
    private int marketCap;
    private String currency;
}
