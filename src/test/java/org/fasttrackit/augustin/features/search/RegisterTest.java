package org.fasttrackit.augustin.features.search;


import org.fasttrackit.augustin.steps.serenity.RegisterSteps;
import org.fasttrackit.augustin.utils.Constants;
import org.junit.Test;

import java.util.UUID;

public class RegisterTest extends BaseTest{

    public RegisterSteps registerSteps;


    @Test
        public void registerWithValidCredentials(){
            String randomEmail = randomEmail();

            registerSteps.navigateToRegister();
            registerSteps.setCredentials(randomEmail, Constants.USER_PASSWORD);
            registerSteps.clickOnRegisterButton();
            registerSteps.verifyUsername(randomEmail);
        }
        private static String randomEmail(){
            return "qa.bancosagu" + UUID.randomUUID().toString() + "@gmail.com";
        }


}
