package com.healthcare.exception;

public class centerNotFoundException extends RuntimeException{
    private String message;

    public centerNotFoundException(String message) {
        super(message);
    }
}
