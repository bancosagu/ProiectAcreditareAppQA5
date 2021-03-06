package org.fasttrackit.augustin.steps.serenity;

import net.thucydides.core.annotations.Step;

public class CartSteps extends BaseSteps{

    @Step
    public void addSearchedProductToCart(String product){
        searchResultsPage.addSearchedProductFromListToCart(product);
    }

    @Step
    public void addProductFromListToCart(String product){
        searchResultsPage.addSearchedProductFromListToCart(product);
    }


    @Step
    public void addBeltAndCapToCart(){
        homePage.open();
        homePage.clickShopLink();
        shopPage.addProductBeltToCart();
        shopPage.addProductCapToCart();


    }
    @Step
    public void checkPriceForBeltAndCap(){
        homePage.clickCartLink();
        cartPage.isCartSubtotalCorrect();
        cartPage.isGrandTotalPriceCorrect();
    }
}
