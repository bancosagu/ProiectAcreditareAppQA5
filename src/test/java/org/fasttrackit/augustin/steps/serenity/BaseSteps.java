package org.fasttrackit.augustin.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.augustin.pages.*;
import org.fasttrackit.augustin.utils.Constants;

public class BaseSteps extends ScenarioSteps {
    public CartPage cartPage;
    public CheckoutPage checkoutPage;
    public HomePage homePage;
    public MyAccountPage myAccountPage;
    public ShopPage shopPage;

    @Step
    public void navigateToMyAccountPage(){
        homePage.open();
        homePage.clickMyAccountLink();
    }

    @Step
    public void navigateToAdminPage(){
        getDriver().get(Constants.ADMIN_BASE_URL);
    }

    @Step
    public void navigateToHomepage(){
        getDriver().get(Constants.BASE_URL);
    }

}
