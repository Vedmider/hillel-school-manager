package com.hillel.application.springBootTest;

import com.hillel.application.presentation.model.Car;
import com.hillel.application.service.SchoolService;
import com.hillel.application.service.SchoolServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarSpringBootTest {

    @Autowired
    SchoolServiceImpl schoolService;

    @Test
    public void testCar() {
        Car car = new Car();
        car.setLicense("1");

        schoolService.validateCar(car);
    }
}
