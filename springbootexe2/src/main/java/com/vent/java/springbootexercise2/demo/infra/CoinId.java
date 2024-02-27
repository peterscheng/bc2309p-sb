package com.vent.java.springbootexercise2.demo.infra;

public enum CoinId {
    bitcoin,ethereum;

    public String toLowerCase(){
        return this.name().toLowerCase();
    }
}
