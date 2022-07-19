package org.fasttrackit.augustin.features.search;

import org.fasttrackit.augustin.utils.Constants;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginWithValidCredentials(){
        loginSteps.navigateToLogin();
        loginSteps.setCredentials(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        loginSteps.clickLoginButton();
    }

    @Test
    public void loginWithInvalidPassword() {
        loginSteps.navigateToLogin();
        loginSteps.setCredentials(Constants.USER_EMAIL, "123455");
        loginSteps.clickLoginButton();
    }

    @Test
    public void loginWithInvalidEmail() {
        loginSteps.navigateToLogin();
        loginSteps.setCredentials("as1234dfg@gmail.com", "123455");
        loginSteps.clickLoginButton();
    }

}
