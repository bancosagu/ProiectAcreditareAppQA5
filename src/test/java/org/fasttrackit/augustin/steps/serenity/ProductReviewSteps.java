package org.fasttrackit.augustin.steps.serenity;

import kotlin.jvm.Strictfp;
import net.thucydides.core.annotations.Step;

public class ProductReviewSteps extends BaseSteps{

    @Step
    public void openBeltProductPage() {
        homePage.open();
        homePage.clickShopLink();
        shopPage.openBeltProductPage();
    }
    @Step
    public void writeReviewAndSubmit(String comment) {
        beltProductPage.openReviewsTab();
        beltProductPage.setCommentField(comment);
        beltProductPage.giveRating4Stars();
        beltProductPage.clickSubmitButton();
    }
    @Step
    public void openCommentsMenu(){adminDashboardPage.clickOnCommentsMenu();}
    @Step
    public void approveComment(String comment){
        adminDashboardPage.clickOnCommentsMenu();
        adminDashboardPage.verifySubmittedComment(comment);
        adminDashboardPage.clickApproveButton();
    }
    @Step
    public void goToHomePage(){homePage.open();}

    @Step
    public void checkIfApprovedCommentIsDisplayedOnProductPage(String comment){
        beltProductPage.verifyApprovedComment(comment);
    }



}
