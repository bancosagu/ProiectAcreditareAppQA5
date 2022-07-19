package org.fasttrackit.augustin.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {

    @FindBy(id = "coupon_code")
    private WebElementFacade couponCodeField;
    @FindBy(id = "[name='apply_coupon']")
    private WebElementFacade applyCoupon;
    @FindBy(id = "[name='update_cart']")
    private WebElementFacade updateCart;
    @FindBy(css = "checkout-button")
    private WebElementFacade proceedToCheckout;


    public void fillCouponCode(String couponCode){typeInto(couponCodeField, couponCode);}
    public void clickApplyCoupon(){clickOn(applyCoupon);}
    public void clickUpdateCart(){clickOn(updateCart);}
    public void clickProceedToCheckout(){clickOn(proceedToCheckout);}
}
