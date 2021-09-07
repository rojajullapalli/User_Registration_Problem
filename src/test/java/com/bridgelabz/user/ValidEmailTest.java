package com.bridgelabz.user;

import org.junit.Before;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.runner.*;
import org.junit.runners.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;



@RunWith(Parameterized.class)
public class ValidEmailTest  {
    private String emailToTest;
    private boolean expectedResult;
    private UserRegistration user;

    public ValidEmailTest(String emailToTest, boolean expectedResult) {
        super();
        this.emailToTest = emailToTest;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initialize(){
        user=new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},{"abc-100@yahoo.com", true},{"abc.100@yahoo.com", true},{"abc111@abc.com", true},
                {"abc-100@abc.net", true},{"abc.100@abc.com.au", true},{"abc@1.com", true},{"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},{"abc", false},{"abc@.com.my", false},{"abc123@gmail.a", false},{"abc123@.com", false},{"abc123@.com.com", false},
                {".abc@abc.com", false},{"abc()*@gmail.com", false},{"abc@%*.com", false},{"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},{"abc@gmail.com.1a", false},{"abc@gmail.com.aa.au ", false}
        });
    }

    @Test
    public void validEmail() {
        System.out.println("valid");
        //UserRegistration user = new UserRegistration();
        Assert.assertEquals(this.expectedResult,user.validEmail(this.emailToTest));
    }


}
