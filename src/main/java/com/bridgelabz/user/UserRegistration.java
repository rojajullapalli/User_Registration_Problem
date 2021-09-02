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

        String EmailRegex = "^([a-zA-Z0-9]{3,})(.[a-zA-Z0-9]{3,})?(\\@[a-zA-Z0-9]{1,})(\\.[a-zA-Z]{2,4})+$";;
                return email.matches(EmailRegex);
    }

    public static boolean validPhoneNumber(String number){
        String phoneRegex = "^[0-9]{2}[\s][0-9]{10}$";
        return number.matches(phoneRegex);
    }

    public static boolean validPassword(String password){
        String passwordRegex = "^(?=.*[A-Z0-9a-z])(?=.*[!@#$%^&*();]{1}).{8,12}$";
        return password.matches(passwordRegex);
    }

    public static String analyzeMood(String word) {
        return "Happy";
    }

}
