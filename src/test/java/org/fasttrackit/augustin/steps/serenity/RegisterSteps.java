package org.fasttrackit.augustin.steps.serenity;

import net.thucydides.core.annotations.Step;

public class RegisterSteps extends BaseSteps{

    @Step
    public void navigateToMyAccountPage(){
        navigateToMyAccountPage();
    }

    @Step
    public void setCredentials(String email){
        myAccountPage.setRegisterEmailField(email);
        myAccountPage.setRegisterPasswordField("123456");
    }
    @Step
    public void clickRegisterButton(){
        clickRegisterButton();
    }



    @Step
    public void verifySuccessMessage(String){
    myAccountPage.verifyWelcomeMessage(String welcome);
    }

    @Step
    public void verifyUsername(String userName){
        myAccountPage.verifyUsernameRegistration(userName);

    }
}
