package com.bridgelabz.user;

public class validPasswordException extends Exception{

    enum PasswordType{
        INVALID_PASSWORD;
    }
    PasswordType type;
    public validPasswordException(PasswordType type, String message) {
        super(message);
        this.type = type;
    }
}
