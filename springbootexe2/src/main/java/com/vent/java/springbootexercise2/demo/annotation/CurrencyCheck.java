package com.vent.java.springbootexercise2.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CurrencyValidator.class) // how to validate
public @interface CurrencyCheck {
    public String message()

    default "Invalid Currency. Please use a valid Currency to try again.";// error msg if validation fail

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
