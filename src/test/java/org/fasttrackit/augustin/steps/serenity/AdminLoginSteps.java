package org.fasttrackit.augustin.steps.serenity;

import net.thucydides.core.annotations.Step;

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
    public void doAdminLogin(String username, String password){
        navigateToAdmin();
        setCredentials(username, password);
        clickAdminLoginButton();
    }

    @Step
    public void doAdminLoginAndRememberMe(String userName, String password){
        navigateToAdmin();
        setCredentials(userName,password);
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
