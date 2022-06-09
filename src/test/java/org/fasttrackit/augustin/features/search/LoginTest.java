package org.fasttrackit.augustin.features.search;

import org.fasttrackit.augustin.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginWithValidCredentials(){
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        loginSteps.clickLoginButton();
    }

}
