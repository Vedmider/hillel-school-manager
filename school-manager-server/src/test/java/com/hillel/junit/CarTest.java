package com.hillel.junit;

import com.hillel.application.presentation.model.Car;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class CarTest {


    @Test
    public void testCarPlateConstraint() {
        Car car = new Car();
        car.setLicense("1");
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Car>> validate = validator.validate(car);
        System.out.println(validate);
    }
}
