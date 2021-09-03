package com.bridgelabz.user;

public class UserRegistration{
    public boolean validInputFirstName(String fName) throws ValidFirstnameException {
        String userName = "^[A-Z]{1}[a-z]{2,}$";
        boolean match = fName.matches(userName);
            if(match == true) {
                return true;}
            else {
                throw new ValidFirstnameException(ValidFirstnameException.ExceptionType.ENTERED_SMALL,"please enter a valid first name");
            }
    }

    public  boolean validInputLastName(String lName) throws ValidFirstnameException {
        String userName = "^[A-Z]{1}[a-z]{2,}$";
        boolean match = lName.matches(userName);
        if(match == true) {
            return true;}
        else {
            throw new ValidFirstnameException(ValidFirstnameException.ExceptionType.ENTERED_SMALL,"please enter a valid first name");
        }
    }

    public boolean validEmail(String email) throws ValidEmailException {

        String EmailRegex = "^([a-zA-Z0-9]{3,})(.[a-zA-Z0-9]{3,})?(\\@[a-zA-Z0-9]{1,})(\\.[a-zA-Z]{2,4})+$";;
        boolean match = email.matches(EmailRegex);
        if(match == true) {
            return true;}
        else {
            throw new ValidEmailException(ValidEmailException.EmailType.ENTERED_INVALID,"please enter a valid Email");
        }
    }

    public static boolean validPhoneNumber(String number) throws validPhoneNumberException {
        String phoneRegex = "^[0-9]{2}[\s][0-9]{10}$";
        boolean match = number.matches(phoneRegex);
        if(match == true) {
            return true;}
        else {
            throw new validPhoneNumberException(validPhoneNumberException.PhoneNumberType.INVALID_PHONE_NUMBER,"please enter a valid phone number");
        }
    }

    public static boolean validPassword(String password) throws validPasswordException {
        String passwordRegex = "^(?=.*[A-Z0-9a-z])(?=.*[!@#$%^&*();]{1}).{8,12}$";
        boolean match = password.matches(passwordRegex);
        if(match == true) {
            return true;}
        else {
            throw new validPasswordException(validPasswordException.PasswordType.INVALID_PASSWORD,"please enter a valid password");
        }
    }
}
