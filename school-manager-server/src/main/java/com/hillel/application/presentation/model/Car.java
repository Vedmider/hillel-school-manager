package com.hillel.application.presentation.model;

import com.hillel.application.service.validation.annotation.ValidLicensePlate;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Validated
public class Car {
    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @ValidLicensePlate
    private String license;
}
