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
public class Stock implements Serializable {
    private int c;// currentPrice;
    private int d;
    private int dp;
    private int h;
    private int l;
    private int o;
    private int pc;
}
