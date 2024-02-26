package com.vent.java.springbootexercise2.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ROI {
    private String times;
    private String currency;
    private int percentage;
}
