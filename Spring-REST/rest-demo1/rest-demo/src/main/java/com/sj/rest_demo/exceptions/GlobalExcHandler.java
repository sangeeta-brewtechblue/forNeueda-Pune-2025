package com.sj.rest_demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExcHandler {

         @ExceptionHandler(BookNotFoundException.class)
         public ResponseEntity handleBookNotFoundException(BookNotFoundException ex){

             return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
         }


}
