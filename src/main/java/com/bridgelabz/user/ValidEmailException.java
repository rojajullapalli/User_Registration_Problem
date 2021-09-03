package com.bridgelabz.user;

public class ValidEmailException extends Exception{
    enum EmailType{
        ENTERED_INVALID
    }
    EmailType type;
    public ValidEmailException(EmailType type, String message) {
        super(message);
        type = this.type;
    }

}
