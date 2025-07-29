package com.sj.rest_demo.exceptions;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException() {
        super("The book does not exist with this id");
    }
}
