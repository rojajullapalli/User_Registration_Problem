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
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenImProper_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validEmail("abc.in");
        Assertions.assertFalse(result);
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
