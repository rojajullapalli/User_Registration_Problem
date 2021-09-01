package com.bridgelabz.user;

public class UserRegistration {
    public static boolean validInputFirstName(String fName) {
        String userName = "^[A-Z]{1}[a-z]{2,}$";
        return fName.matches(userName);
    }

    public static boolean validInputLastName(String lName) {
        String userName = "^[A-Z]{1}[a-z]{2,}$";
        return lName.matches(userName);
    }

    public static boolean validEmail(String email){
        String EmailRegex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
        return email.matches(EmailRegex);
    }

    public static boolean validPhoneNumber(String number){
        String phoneRegex = "^\\+?([0-9]{2})\\)?[-]?([0-9]{10})$";
        return number.matches(phoneRegex);
    }

    public static boolean validPassword(String password){
        String emailRegex = "^\\+?[A-Za-z]{8}$";
        return password.matches(emailRegex);
    }

}
