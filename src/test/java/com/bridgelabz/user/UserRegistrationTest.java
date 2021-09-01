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


}
