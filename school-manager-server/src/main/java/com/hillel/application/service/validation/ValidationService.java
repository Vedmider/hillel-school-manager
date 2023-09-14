package com.hillel.application.service.validation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.Set;

public class ValidationService {


    public boolean isValid(Object obj) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Object>> validated = validator.validate(obj);

        if (!validated.isEmpty()) {
            return false;
        }

        return true;
    }

    public boolean isValid(Object obj, Class clazz) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Object>> validated = validator.validate(obj, clazz);

        if (!validated.isEmpty()) {
            return false;
        }

        return true;
    }

}
