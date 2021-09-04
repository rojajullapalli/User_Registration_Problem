package com.bridgelabz.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        ExpectedException exceptionRule = ExpectedException.none();
        exceptionRule.expect(ValidException.class);
        try {
            boolean result = registration.validInputFirstName("Roja");
            Assertions.assertTrue(result);
        } catch(ValidException e) {
               e.printStackTrace();
            }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue()  {
        UserRegistration registration = new UserRegistration();
        ExpectedException exceptionRule = ExpectedException.none();
        exceptionRule.expect(ValidException.class);
        try {
            boolean result = registration.validInputLastName("Julapalli");
            Assertions.assertTrue(result);
        } catch(ValidException e) {
            e.printStackTrace();
        }
    }

   @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
       ExpectedException exceptionRule = ExpectedException.none();
       exceptionRule.expect(ValidException.class);
       try {
           boolean result = registration.validEmail("abc.xyz@bl.co.in");
           Assertions.assertTrue(result);
       } catch(ValidException e) {
           e.printStackTrace();
       }
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        ExpectedException exceptionRule = ExpectedException.none();
        exceptionRule.expect(ValidException.class);
        try {
            boolean result = registration.validPhoneNumber("91 9159311833");
            Assertions.assertTrue(result);
        }catch (ValidException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        ExpectedException exceptionRule = ExpectedException.none();
        exceptionRule.expect(ValidException.class);
        try {
            boolean result = registration.validPassword("Firtcry24@99");
            Assertions.assertTrue(result);
        } catch (ValidException e) {
            e.printStackTrace();
        }
    }

}
