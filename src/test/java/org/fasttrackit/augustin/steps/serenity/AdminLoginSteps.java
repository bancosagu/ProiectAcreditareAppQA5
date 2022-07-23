package org.fasttrackit.augustin.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.augustin.utils.Constants;

public class AdminLoginSteps extends BaseSteps{

    @Step
    public void navigateToAdmin(){navigateToAdminLoginPage();}

    @Step
    public void setCredentials (String userName, String password){
        adminLoginPage.setAdminUsernameField(userName);
        adminLoginPage.setAdminPassField(password);
    }
    @Step
    public void clickRememberMeCheckBox(){
        adminLoginPage.setRememberMeCheckBox();
    }
    @Step
    public void clickAdminLoginButton(){
        adminLoginPage.pressAdminLoginButton();
    }

    @Step
    public void doAdminLogin(){
        navigateToAdmin();
        setCredentials(Constants.ADMIN_USERNAME, Constants.ADMIN_PASSWORD);
        clickAdminLoginButton();
        verifyWelcomeMessage("Howdy, " + Constants.ADMIN_USERNAME);
    }

    @Step
    public void doAdminLoginAndRememberMe(){
        navigateToAdmin();
        setCredentials(Constants.ADMIN_USERNAME, Constants.ADMIN_PASSWORD);
        clickRememberMeCheckBox();
        clickAdminLoginButton();
    }

    @Step
    public void verifyWelcomeMessage(String welcome){
        adminDashboardPage.verifyIfLandedOnDashboard(welcome);
    }

    public void verifyInvalidUsernameError(String error) {
        adminDashboardPage.verifyUsernameErrorMessage(error);
    }

    public void verifyInvalidPasswordError(String error) {
        adminDashboardPage.verifyPasswordErrorMessage(error);
            }
}
