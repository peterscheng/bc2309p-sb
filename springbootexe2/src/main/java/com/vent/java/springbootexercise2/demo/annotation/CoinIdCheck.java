package com.vent.java.springbootexercise2.demo.annotation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CoinIdValidator.class) // how to validate
public @interface CoinIdCheck {
    public String message()
            default "Invalid CoinIds. Please use a valid CoinIds to try again.";// error msg if validation fail

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
