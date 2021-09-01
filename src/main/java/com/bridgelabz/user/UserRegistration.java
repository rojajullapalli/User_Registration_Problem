package com.bridgelabz.user;

public class UserRegistration {
    public static boolean validInputFirstName(String Fname) {
        String USER_NAME = "^[A-Z]{1}[a-z]{2,}$";
        return Fname.matches(USER_NAME);
    }

    public static boolean validInputLastName(String Lname) {
        String USER_NAME = "^[A-Z]{1}[a-z]{2,}$";
        return Lname.matches(USER_NAME);
    }

}
