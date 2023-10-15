package com.hillel.application.service;

import com.hillel.application.presentation.model.Car;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.validation.Valid;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class SchoolServiceImpl implements SchoolService{


    @PersistenceContext
    private EntityManager em;


    @Async
    public void doSomething() {

    }

    public void validateCar(@Valid Car car) {
        System.out.println("Validated");
    }

    @Override
    public Car create() {
        return null;
    }
}
