package org.fasttrackit.augustin.features.search;

import org.fasttrackit.augustin.utils.Constants;
import org.junit.Test;

import java.util.UUID;

public class ProductTest extends BaseTest{

    @Test
    public void writeReviewApproveCheckIfDisplayed() {
        String randomComment = randomComment();

        loginSteps.doLogin();
        productReviewSteps.openBeltProductPage();
        productReviewSteps.writeReviewAndSubmit(randomComment);
        logoutSteps.logout();
        adminLoginSteps.doAdminLogin();
        productReviewSteps.approveComment(randomComment);
        logoutSteps.adminLogout();
        productReviewSteps.goToHomePage();
        productReviewSteps.openBeltProductPage();
        productReviewSteps.openCommentsMenu();
        productReviewSteps.checkIfApprovedCommentIsDisplayedOnProductPage(randomComment);
    }

    private static String randomComment(){
        return "Folosind sirul aleator de caractere: '" + UUID.randomUUID() + "' ne asiguram ca nu cade testul din cauza dublurilor. ";}


    //approve comment
    //logout
    //open product page as guest
    //check if review is displayed



//    Write a review, add rating + submit
//    Approve review in admin mode
//    Check if review is displayed

}
