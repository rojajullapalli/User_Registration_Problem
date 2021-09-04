package com.bridgelabz.user;

public class UserRegistration{
    public boolean validInputFirstName(String fName) throws ValidException {
        String userName = "^[A-Z]{1}[a-z]{2,}$";
        boolean match = fName.matches(userName);
            if(match) {
                return true;}
            else {
                throw new ValidException(ValidException.ExceptionType.ENTERED_SMALL,"please enter a valid first name");
            }
    }

    public  boolean validInputLastName(String lName) throws ValidException {
        String userName = "^[A-Z]{1}[a-z]{2,}$";
        boolean match = lName.matches(userName);
        if(match) {
            return true;}
        else {
            throw new ValidException(ValidException.ExceptionType.ENTERED_SMALL,"please enter a valid Last name");
        }
    }

    public boolean validEmail(String email) throws ValidException {

        String EmailRegex = "^([a-zA-Z0-9]{3,})(.[a-zA-Z0-9]{3,})?(\\@[a-zA-Z0-9]{1,})(\\.[a-zA-Z]{2,4})+$";;
        boolean match = email.matches(EmailRegex);
        if(match) {
            return true;}
        else {
            throw new ValidException(ValidException.ExceptionType.ENTERED_INVALID,"please enter a valid Email");
        }
    }

    public static boolean validPhoneNumber(String number) throws ValidException {
        String phoneRegex = "^[1-9]{2}[\s][1-9]{1}[0-9]{9}$";
        boolean match = number.matches(phoneRegex);
        if(match) {
            return true;}
        else {
            throw new ValidException(ValidException.ExceptionType.INVALID_PHONE_NUMBER,"please enter a valid phone number");
        }
    }

    public static boolean validPassword(String password) throws ValidException {
        String passwordRegex = "^(?=.*[A-Z0-9a-z])(?=.*[!@#$%^&*();]{1}).{8,12}$";
        boolean match = password.matches(passwordRegex);
        if(match) {
            return true;}
        else {
            throw new ValidException(ValidException.ExceptionType.INVALID_PASSWORD,"please enter a valid password");
        }
    }
}
