package org.fasttrackit.augustin.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade loginUsernameField;
    @FindBy(id = "password")
    private WebElementFacade loginPasswordField;
    @FindBy(css = "[name='login']")
    private WebElementFacade loginButton;
    @FindBy(id ="reg_email" )
    private WebElementFacade registerEmailField;
    @FindBy(id = "reg_password")
    private WebElementFacade registerPasswordField;
    @FindBy(id = "woocommerce-Button button")
    private WebElementFacade registerButton;
    @FindBy(css = ".user-name")
    private WebElementFacade registeredUsername;
    @FindBy(css = ".welcome-user")
    private WebElementFacade welcomeMessage;


    public void setLoginUsernameField(String email){
        typeInto(loginUsernameField, email);
    }
    public void setLoginPasswordField(String password){
        typeInto(loginPasswordField, password);
    }
    public void clickLoginButton(){
        clickOn(loginButton);
    }


    public void setRegisterEmailField(String email){typeInto(registerEmailField);}
    public void setRegisterPasswordField(String password){typeInto(registerPasswordField);}
    public void clickRegisterButton(){clickOn(registerButton);}

    public void verifyUsernameRegistration(String userName){registeredUsername.shouldContainText(userName);
    public void verifyWelcomeMessage(String welcome){welcomeMessage.shouldContainText("Welcome");
    }

}
