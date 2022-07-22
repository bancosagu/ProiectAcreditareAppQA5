package org.fasttrackit.augustin.steps.serenity;

import net.thucydides.core.annotations.Step;

public class ProductReviewSteps extends BaseSteps{

    @Step
    public void openBeltProductPage() {
        homePage.open();
        homePage.clickShopLink();
        shopPage.openBeltProductPage();
    }
    @Step
    public void setReview(String comment) {
        beltProductPage.openReviewsTab();
        beltProductPage.setCommentField(comment);
        beltProductPage.clickSubmitButton();
    }


}
