package org.fasttrackit.augustin.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.augustin.utils.Constants;


public class LoginSteps extends BaseSteps {



    @Step
    public void navigateToLogin(){
        navigateToMyAccountPage();}

    @Step
    public void setCredentials(String email, String password){
        myAccountPage.setLoginUsernameField(email);
        myAccountPage.setLoginPasswordField(password);}
    @Step
    public void clickLoginButton(){
        myAccountPage.clickLoginButton();}



    @Step
    public void verifyWelcomeMessage(String welcome){
    myAccountPage.verifyWelcomeMessage(welcome);}
    @Step
    public void verifyIncorrectPasswordErrorMessage(String error){
        myAccountPage.verifyIncorrectPasswordError(error);}

    @Step
    public void verifyInvalidEmailMessage(String error){myAccountPage.verifyInvalidEmailError(error);}




    @Step
    public void doLogin(){
    navigateToLogin();
    setCredentials(Constants.USER_EMAIL, Constants.USER_PASSWORD);
    clickLoginButton();
    verifyWelcomeMessage("Welcome " + Constants.USERNAME + " !");}



}
