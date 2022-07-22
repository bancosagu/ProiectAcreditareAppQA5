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

    public void openReviewsTab(){
        clickOn(reviewsTab);
    }
    public void setCommentField(String comment){
        typeInto(commentField, comment);
    }
    public void clickSubmitButton(){
        clickOn(submitButton);
    }

}
