package org.fasttrackit.augustin.steps.serenity;

import net.thucydides.core.annotations.Step;

public class RegisterSteps extends BaseSteps{

    @Step
    public void navigateToRegister(){
        navigateToMyAccountPage();
    }

    @Step
    public void setCredentials(String email, String password){
        myAccountPage.setRegisterEmailField(email);
        myAccountPage.setRegisterPasswordField(password);
    }
    @Step
    public void clickOnRegisterButton(){
        myAccountPage.clickRegisterButton();
    }
    @Step
    public void verifyUsername(String username){
        myAccountPage.verifyRegisteredUsername(username);
    }



//    @Step
//    public void verifySuccessMessage(String){
//    myAccountPage.verifyWelcomeMessage(String welcome);
//    }
//
//    @Step
//    public void verifyUsername(String userName){
//        myAccountPage.verifyUsernameRegistration(userName);}


}
