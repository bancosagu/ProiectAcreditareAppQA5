package org.fasttrackit.augustin.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.augustin.steps.serenity.RegisterSteps;
import org.junit.Test;

import java.util.UUID;

public class RegisterTest extends BaseTest{


    @Steps
    protected RegisterSteps registerSteps;

    @Test
        public void registerWithValidCredentials(){
            String randomEmail = randomEmail();
            registerSteps.navigateToMyAccountPage();
            registerSteps.setCredentials(randomEmail, "Pass1234Word5678");
            registerSteps.clickOnRegisterButton();
        }
        private static String randomEmail(){
            return "qa.bancosagu" + UUID.randomUUID().toString() + "@gmail.com";
        }
}
