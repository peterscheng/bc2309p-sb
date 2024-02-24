package com.vent.java.springbootexercise1.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StockDTO {
    private CompanyDTO companyProfile;
    private int currentPrice;
    private int dayHigh;
    private int dayLow;
    private int dayOpen;
    private int prevDayClose;
}
