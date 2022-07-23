package org.fasttrackit.augustin.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class BeltProductPage extends PageObject {
    @FindBy(css = "#tab-title-reviews > a")
    private WebElementFacade reviewsTab;
    @FindBy(id = "comment")
    private WebElementFacade commentField;
    @FindBy(id = "submit")
    private WebElementFacade submitButton;
    @FindBy(css = ".stars .star-4")
    private WebElementFacade rating4Stars;
    @FindBy(css = "#comment-774 .description > p")
    private WebElementFacade approvedComment;


    public void openReviewsTab(){
        clickOn(reviewsTab);
    }
    public void setCommentField(String comment){
        typeInto(commentField, comment);
    }
    public void giveRating4Stars(){clickOn(rating4Stars);}
    public void clickSubmitButton(){
        clickOn(submitButton);
    }
    public void verifyApprovedComment(String comment){
        approvedComment.shouldContainText(comment);
    }

}
