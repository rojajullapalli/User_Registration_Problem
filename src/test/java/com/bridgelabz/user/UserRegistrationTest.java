package com.bridgelabz.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void  givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validInputFirstName("Roja");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validInputFirstName("roja");
        Assertions.assertFalse(result);
    }

    @Test
    public void  givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validInputLastName("Julapalli");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validInputLastName("julapalli");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validEmail("abc.xyz@bl.co.in");
        boolean result1 = registration.validEmail("abc@yahoo.com");
        boolean result2 = registration.validEmail("abc-100@yahoo.com");
        boolean result3 = registration.validEmail("abc.100@yahoo.com");
        boolean result4 = registration.validEmail("abc-100@abc.net");
        boolean result5 = registration.validEmail("abc.100@abc.com.au");
        boolean result6 = registration.validEmail("abc@1.com");
        boolean result7 = registration.validEmail("abc@gmail.com.com");
        boolean result8 = registration.validEmail("abc+100@gmail.com");
        boolean result9 = registration.validEmail("abc111@abc.net");
        Assertions.assertTrue(result);
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);
        Assertions.assertTrue(result3);
        Assertions.assertTrue(result4);
        Assertions.assertTrue(result5);
        Assertions.assertTrue(result6);
        Assertions.assertTrue(result7);
        Assertions.assertTrue(result8);
        Assertions.assertTrue(result9);
    }

    @Test
    public void givenEmail_WhenImProper_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validEmail("abc.in");
        boolean result1 = registration.validEmail("abc");
        boolean result2 = registration.validEmail("abc@.com.my");
        boolean result3 = registration.validEmail("abc123@gmail.a");
        boolean result4 = registration.validEmail("abc123@.com");
        boolean result5 = registration.validEmail("abc123@.com.com");
        boolean result6 = registration.validEmail(".abc@abc.com");
        boolean result7 = registration.validEmail("abc()*@gmail.com");
        boolean result8 = registration.validEmail("abc@%*.com");
        boolean result10 = registration.validEmail("abc.@gmail.com");
        boolean result11 = registration.validEmail("abc@abc@gmail.com");
        boolean result12 = registration.validEmail("abc@gmail.com.1a");
        Assertions.assertFalse(result);
        Assertions.assertFalse(result1);
        Assertions.assertFalse(result2);
        Assertions.assertFalse(result3);
        Assertions.assertFalse(result4);
        Assertions.assertFalse(result5);
        Assertions.assertFalse(result6);
        Assertions.assertFalse(result7);
        Assertions.assertFalse(result8);
        Assertions.assertFalse(result10);
        Assertions.assertFalse(result11);
        Assertions.assertFalse(result12);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validPhoneNumber("91 9159311833");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenImProperSize_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validPhoneNumber("9191593118");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenProperSize_Eight_WithOneUpperCase_AndOneNumber_AndOneSpecialCharacter_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validPassword("Firtcry2499@");
        Assertions.assertTrue(result);
    }
    

    @Test
    public void givenPassword_WhenImProperSize_Eight_WithOneUpperCase_AndOneNumber_AndOneSpecialCharacter_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validPassword("rojajules");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenImProperSize_Eight_WithOneUpperCase_AndOneNumber_AndTwoSpecialCharacter_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validPassword("#Firtcry2499@");
        Assertions.assertFalse(result);
    }

}
