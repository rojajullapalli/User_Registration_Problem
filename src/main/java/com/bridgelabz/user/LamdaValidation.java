package com.bridgelabz.user;

import java.util.Scanner;
import java.util.regex.Pattern;


interface Validation{

    boolean validate(String regEx, String input);

    static void printResult(String regEx, String input, String function, Validation fobj ){
        if(fobj.validate(regEx, input) == true){
            System.out.println(function + "-valid");
        }else{
            System.out.println(function + "-invalid");
        }
    }
}

public class LamdaValidation {


    public static String inputCall(String userInput){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + userInput);
        String userInp = scan.nextLine();
        return userInp;
    }
    public static void main(String[] args) {
        //lambda expression
        Validation inputCheck = (String regEx, String input) -> {
            boolean check= Pattern.matches(regEx,input);
            return check;
        };

        String fName = LamdaValidation.inputCall("First Name");
        String lName = LamdaValidation.inputCall("Last Name");
        String email = LamdaValidation.inputCall("Email");
        String mobileNum = LamdaValidation.inputCall("Mobile Number");
        String passWord = LamdaValidation.inputCall("Password");
        System.out.println("\n");

        Validation.printResult("^[A-Z]{1}[a-z]{2,}", fName, "First Name", inputCheck);
        Validation.printResult("^[A-Z]{1}[a-z]{2,}", lName, "Last Name", inputCheck);
        Validation.printResult("^([a-zA-Z0-9]{3,})(.[a-zA-Z0-9]{3,})?(\\@[a-zA-Z0-9]{1,})(\\.[a-zA-Z]{2,4})+$", email, "Email", inputCheck);
        Validation.printResult("^[1-9]{2}[\s][1-9]{1}[0-9]{9}$", mobileNum,"mobileNum", inputCheck);
        Validation.printResult("^(?=.*[A-Z0-9a-z])(?=.*[!@#$%^&*();]{1}).{8,}$", passWord, "Password", inputCheck);
    }
}
