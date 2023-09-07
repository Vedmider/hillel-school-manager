package com.hillel.application.infrastructure.exceptions;

import com.hillel.application.presentation.model.ProblemDetails;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomControllerAdviceHandler {

    @ExceptionHandler(SchoolManagerArchitecturalException.class)
    public ResponseEntity handleThinkingError(SchoolManagerArchitecturalException exception) {
        ProblemDetails problemDetails = new ProblemDetails();
        problemDetails.description = "Too late to be wise";
        problemDetails.errorType = "Thinking problem";
        problemDetails.rootCause = "You did not think before you were able to solve the problem";
        problemDetails.exceptionMessage = exception.getMessage();

        return new ResponseEntity<>(problemDetails, new HttpHeaders(), HttpStatus.TOO_EARLY);
    }
}
