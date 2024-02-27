package com.vent.java.springbootexercise2.demo.infra;

import com.vent.java.springbootexercise2.demo.dto.request.CurrencyDTO;

public enum Currency {
    USD,CNY;

    public String toLowerCase(){
        return this.name().toLowerCase();
    }

}
