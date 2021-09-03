package com.bridgelabz.user;

public class ValidFirstnameException extends Exception{
    enum ExceptionType{
        ENTERED_SMALL
    }
    ExceptionType type;
    public ValidFirstnameException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
