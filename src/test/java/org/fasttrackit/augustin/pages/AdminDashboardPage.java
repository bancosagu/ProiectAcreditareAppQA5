package org.fasttrackit.augustin.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class AdminDashboardPage extends PageObject {

    @FindBy(css = "#wp-admin-bar-my-account > a")
    private WebElementFacade welcomeMessage;
    @FindBy(id = "login_error")
    private WebElementFacade loginUsernameError;
    @FindBy(id = "login_error")
    private WebElementFacade loginPasswordError;
    @FindBy(id = "#menu-comments > a > .wp-menu-name")
    private WebElementFacade commentsMenu;
    @FindBy(css = "#comment-774 .dashboard-comment-wrap > blockquote > p")
    private WebElementFacade commentToApprove;
    @FindBy(css = "#comment-774 > .comment > .row-actions > .approve")
    private WebElementFacade approveButton;
    @FindBy(id = "wp-admin-bar-my-account")
    private WebElementFacade adminBarMenuPop;
    @FindBy(id = "wp-admin-bar-logout a")
    private WebElementFacade adminLogoutButton;

    public void verifyIfLandedOnDashboard(String welcome){welcomeMessage.shouldContainText(welcome);}

    public void verifyUsernameErrorMessage(String error) {
        loginUsernameError.shouldContainText(error);}

    public void verifyPasswordErrorMessage(String error){
        loginPasswordError.shouldContainText(error);
    }

    public void clickOnCommentsMenu(){clickOn(commentsMenu);}

    public void verifySubmittedComment(String comment){
           commentToApprove.shouldContainText(comment);}

    public void clickApproveButton(){clickOn(approveButton);}
    public void clickAdminBarMenuPop(){clickOn(adminBarMenuPop);}
    public void clickAdminLogoutButton(){clickOn(adminLogoutButton);}
}
// if comment equals randomComment, click approve button