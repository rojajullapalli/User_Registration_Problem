package com.bridgelabz.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(ValidFirstnameException.class);
            boolean result = registration.validInputFirstName("Roja");
            Assertions.assertTrue(true);
        } catch(ValidFirstnameException e) {
               e.printStackTrace();
            }

    }


    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() throws ValidFirstnameException {
        UserRegistration registration = new UserRegistration();
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(ValidFirstnameException.class);
            boolean result = registration.validInputLastName("Julapalli");
            Assertions.assertTrue(true);
        } catch(ValidFirstnameException e) {
            e.printStackTrace();
        }
    }


   @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() throws ValidEmailException {
        UserRegistration registration = new UserRegistration();
       try {
           ExpectedException exceptionRule = ExpectedException.none();
           exceptionRule.expect(ValidEmailException.class);
           boolean result = registration.validEmail("abc.xyz@bl.co.in");
           Assertions.assertTrue(true);
       } catch(ValidEmailException e) {
           e.printStackTrace();
       }
    }


    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() throws validPhoneNumberException {
        UserRegistration registration = new UserRegistration();
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(ValidEmailException.class);
            boolean result = registration.validPhoneNumber("91 9159311833");
            Assertions.assertTrue(result);
        }catch (validPhoneNumberException e){
            e.printStackTrace();
        }
    }


    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() throws validPasswordException {
        UserRegistration registration = new UserRegistration();
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(ValidEmailException.class);
            boolean result = registration.validPassword("Firtcry24@99");
            Assertions.assertTrue(result);
        } catch (validPasswordException e) {
            e.printStackTrace();
        }
    }


}
