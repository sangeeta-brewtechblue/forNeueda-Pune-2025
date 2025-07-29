package com.sj.rest_demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExcHandler {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity handleBookNotFoundException(BookNotFoundException ex) {

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity handleNotNullException(MethodArgumentNotValidException e) {
        if (e.getBindingResult() != null) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Title can not be null");
        } else
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Some error has occurred");

    }
}