package com.hillel.application.infrastructure.exceptions;

import com.hillel.application.presentation.model.ProblemDetails;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdviceHandler {

    @ExceptionHandler(SchoolManagerArchitecturalException.class)
    public ResponseEntity handleArchitecturalException(SchoolManagerArchitecturalException exception) {

        ProblemDetails problemDetails = new ProblemDetails();
        problemDetails.description = "Cannot find the details of your Eiffel tower?";
        problemDetails.errorType = "Missed to create project scheme";
        problemDetails.rootCause = "You were to lazy load";
        problemDetails.exceptionMessage = exception.getMessage();

        return new ResponseEntity<>(problemDetails, new HttpHeaders(), HttpStatus.I_AM_A_TEAPOT);
    }

}
