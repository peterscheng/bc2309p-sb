
package com.vent.java.springbootexercise2.demo.annotation;

import com.vent.java.springbootexercise2.demo.infra.CoinId;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.Objects;

public class CoinIdValidator implements ConstraintValidator<CoinIdCheck, String> {

    @Override
    public boolean isValid(String dtos, ConstraintValidatorContext context) {
        if (Objects.isNull(dtos)) {
            return true;
        }
        String[] coinids = dtos.split(",");
        for (int i = 0; i < coinids.length; i++) {
            String coinid = coinids[i];
            CoinId coinIdDTO = Arrays.stream(CoinId.values()).filter(c -> coinid.toLowerCase().equals(c.toLowerCase())).findAny().orElse(null);
            if (Objects.isNull(coinIdDTO)) {
                return false;
            }
        }
        return true;

    }
}
