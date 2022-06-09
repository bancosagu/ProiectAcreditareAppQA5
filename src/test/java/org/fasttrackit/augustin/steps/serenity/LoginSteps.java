package org.fasttrackit.augustin.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.augustin.pages.HomePage;
import org.fasttrackit.augustin.pages.MyAccountPage;

public class LoginSteps extends ScenarioSteps {
    private HomePage homePage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }
    @Step
    public void navigateToLogin(){
        homePage.clickMyAccountLink();
    }

    @Step
    public void setCredentials(String email, String password){
        myAccountPage.setLoginUsernameField(email);
        myAccountPage.setLoginPasswordField(password);
        }
    @Step
    public void clickLoginButton(){
        myAccountPage.clickLoginButton();



    }

}
