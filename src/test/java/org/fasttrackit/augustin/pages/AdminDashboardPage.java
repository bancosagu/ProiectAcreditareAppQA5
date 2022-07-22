package org.fasttrackit.augustin.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class AdminDashboardPage extends PageObject {

    @FindBy(css = "#wp-admin-bar-my-account > a")
    private WebElementFacade welcomeMessage;
    @FindBy(id = "login_error")
    private WebElementFacade loginUsernameError;
    @FindBy(id = "login_error")
    private WebElementFacade loginPasswordError;


    public void verifyIfLandedOnDashboard(String welcome){welcomeMessage.shouldContainText(welcome);}

    public void verifyUsernameErrorMessage(String error) {
        loginUsernameError.shouldContainText(error);}

    public void verifyPasswordErrorMessage(String error){
        loginPasswordError.shouldContainText(error);
    }

}
