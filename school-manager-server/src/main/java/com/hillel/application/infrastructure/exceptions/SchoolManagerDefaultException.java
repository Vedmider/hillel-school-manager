package com.hillel.application.infrastructure.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.TOO_EARLY, reason = "To early to start working here")
public class SchoolManagerDefaultException extends RuntimeException {

    public SchoolManagerDefaultException() {
        super();
    }

    public SchoolManagerDefaultException(Throwable throwable) {
        super(throwable);
    }
}
