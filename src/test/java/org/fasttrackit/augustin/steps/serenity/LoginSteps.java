package org.fasttrackit.augustin.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.augustin.pages.HomePage;
import org.fasttrackit.augustin.pages.MyAccountPage;

public class LoginSteps extends BaseSteps {
    private HomePage homePage;
    private MyAccountPage myAccountPage;


    @Step
    public void navigateToLogin(){
        navigateToMyAccountPage();
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
    @Step
    public void assertLogin(){
    }

    @Step
    public void doLogin(String email, String password){
    navigateToLogin();
    setCredentials(email, password);
    clickLoginButton();

    }

}
