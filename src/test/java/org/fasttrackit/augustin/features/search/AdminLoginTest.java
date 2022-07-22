package org.fasttrackit.augustin.features.search;

import org.fasttrackit.augustin.utils.Constants;
import org.junit.Test;

public class AdminLoginTest extends BaseTest{

    @Test
    public void loginAdminWithValidCredentials(){
        adminLoginSteps.navigateToAdmin();
        adminLoginSteps.setCredentials(Constants.ADMIN_USERNAME, Constants.ADMIN_PASSWORD);
        adminLoginSteps.clickAdminLoginButton();
        adminLoginSteps.verifyWelcomeMessage("Howdy, " + Constants.ADMIN_USERNAME);
    }

    @Test
    public void loginAdminWithInvalidUsername(){
        adminLoginSteps.navigateToAdmin();
        adminLoginSteps.setCredentials("adnin", Constants.ADMIN_PASSWORD);
        adminLoginSteps.clickAdminLoginButton();
        adminLoginSteps.verifyInvalidUsernameError("ERROR: Invalid username.");
    }

    @Test
    public void loginAdminWithInvalidPassword(){
        adminLoginSteps.navigateToAdmin();
        adminLoginSteps.setCredentials(Constants.ADMIN_USERNAME, Constants.ADMIN_PASSWORD+"parola");
        adminLoginSteps.clickAdminLoginButton();
        adminLoginSteps.verifyInvalidPasswordError("ERROR: The password you entered for the username " + Constants.ADMIN_USERNAME + " is incorrect.");

    }




}
