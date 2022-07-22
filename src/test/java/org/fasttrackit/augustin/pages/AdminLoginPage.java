package org.fasttrackit.augustin.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa5.fasttrackit.org:8008/wp-login.php")
public class AdminLoginPage extends PageObject {

    @FindBy(id = "user_login")
    private WebElementFacade adminUsernameField;
    @FindBy(id = "user_pass")
    private WebElementFacade adminPassField;
    @FindBy(id = "forgetmenot")
    private WebElementFacade rememberMeCheckBox;
    @FindBy(id = "wp-submit")
    private WebElementFacade adminLoginButton;

    public void setAdminUsernameField(String username){
        typeInto(adminUsernameField, username);
    }
    public void setAdminPassField(String password){
        typeInto(adminPassField, password);
    }
    public void setRememberMeCheckBox(){
        clickOn(rememberMeCheckBox);
    }
    public void pressAdminLoginButton(){
        clickOn(adminLoginButton);
    }

}
