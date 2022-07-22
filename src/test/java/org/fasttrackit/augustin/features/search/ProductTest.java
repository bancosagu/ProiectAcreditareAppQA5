package org.fasttrackit.augustin.features.search;

import org.fasttrackit.augustin.utils.Constants;
import org.junit.Test;

public class ProductTest extends BaseTest{

    @Test
    public void writeReviewAprooveCheckIfDisplayed(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        productReviewSteps.openBeltProductPage();
        productReviewSteps.setReview("Comentariu scris manual, aprobat automat!");
        logoutSteps.logout();

    }

    //login as admin
    //aproove comment
    //logout
    //open product page as guest
    //check if review is displayed



//    Write a review, add rating + submit
//    Aproove review in admin mode
//    Check if review is displayed

}
