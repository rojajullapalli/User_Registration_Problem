package com.bridgelabz.user;

public class validPhoneNumberException extends Exception{

    enum PhoneNumberType {
        INVALID_PHONE_NUMBER
    }
    PhoneNumberType type;
    public validPhoneNumberException(PhoneNumberType type, String message) {
        super(message);
        type = this.type;
    }
}
