package org.fasttrackit.augustin.features.search;

import org.fasttrackit.augustin.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginUserWithValidCredentials(){
        loginSteps.navigateToLogin();
        loginSteps.setCredentials(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        loginSteps.clickLoginButton();
        loginSteps.verifyWelcomeMessage("Welcome " + Constants.USERNAME + " !");
    }

    @Test
    public void loginUserWithInvalidPassword() {
        loginSteps.navigateToLogin();
        loginSteps.setCredentials(Constants.USER_EMAIL, "123455");
        loginSteps.clickLoginButton();
        loginSteps.verifyIncorrectPasswordErrorMessage("ERROR");
    }

    @Test
    public void loginUserWithInvalidEmail() {
        loginSteps.navigateToLogin();
        loginSteps.setCredentials("as1234dfg@gmail.com", "123455");
        loginSteps.clickLoginButton();
        loginSteps.verifyInvalidEmailMessage("ERROR: Invalid email address.");
    }

}
