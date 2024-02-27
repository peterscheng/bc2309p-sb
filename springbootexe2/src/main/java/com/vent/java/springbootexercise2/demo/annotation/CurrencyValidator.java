package com.vent.java.springbootexercise2.demo.annotation;

import com.vent.java.springbootexercise2.demo.dto.request.CurrencyDTO;
import com.vent.java.springbootexercise2.demo.infra.Currency;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.Objects;

public class CurrencyValidator implements ConstraintValidator<CurrencyCheck, CurrencyDTO> {

    @Override
    public boolean isValid(CurrencyDTO dto, ConstraintValidatorContext context) {
        if (Objects.isNull(dto)) {
            return false;
        }
        Currency currency = Arrays.stream(Currency.values()).filter(c -> dto.getCurrency().toLowerCase().equals(c.toLowerCase())).findAny().orElse(null);

        return Objects.nonNull(dto) && Objects.nonNull(currency);

    }
}
