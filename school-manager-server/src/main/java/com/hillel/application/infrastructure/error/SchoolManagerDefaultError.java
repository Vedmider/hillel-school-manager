package com.hillel.application.infrastructure.error;

public class SchoolManagerDefaultError extends RuntimeException {

    public SchoolManagerDefaultError() {
        super();
    }

    public SchoolManagerDefaultError(Throwable throwable) {
        super(throwable);
    }
}
