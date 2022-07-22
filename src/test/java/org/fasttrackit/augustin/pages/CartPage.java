package org.fasttrackit.augustin.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(id = "coupon_code")
    private WebElementFacade couponCodeField;
    @FindBy(id = "[name='apply_coupon']")
    private WebElementFacade applyCoupon;
    @FindBy(id = "[name='update_cart']")
    private WebElementFacade updateCart;
    @FindBy(css = "checkout-button")
    private WebElementFacade proceedToCheckout;

    @FindBy(css = ".cart > tbody > tr > td:nth-of-type(6) > span")
    List<WebElementFacade> listOfProductSubtotalSpan;

    @FindBy(css = ".cart-subtotal .woocommerce-Price-amount")
    private WebElementFacade cartSubtotalSpan;

    @FindBy(css = ".shipping .woocommerce-Price-amount")
    private WebElementFacade shippingFeeSpan;

    @FindBy(css = ".order-total .woocommerce-Price-amount")
    private WebElementFacade grandTotal;


    public void fillCouponCode(String couponCode){typeInto(couponCodeField, couponCode);}
    public void clickApplyCoupon(){clickOn(applyCoupon);}
    public void clickUpdateCart(){clickOn(updateCart);}
    public void clickProceedToCheckout(){clickOn(proceedToCheckout);}

    public int getSumOfSubtotals(){
        int sum = 0;
        for(WebElementFacade element : listOfProductSubtotalSpan) {
            sum += getIntFromPrice(element.getText());
        }
        return sum;
    }


    public boolean isCartSubtotalCorrect(){
      return getSumOfSubtotals() == getIntFromPrice(cartSubtotalSpan.getText());
    }

    public int getSumOfSubtotalsPlusShippingFee(){
        String x = cartSubtotalSpan.getText();
        String y = "0";
        if(shippingFeeSpan.isPresent()) {
            y = shippingFeeSpan.getText();
        }
        return getIntFromPrice(x) + getIntFromPrice(y);
        }

    public boolean isGrandTotalPriceCorrect(){
        return getSumOfSubtotalsPlusShippingFee() == getIntFromPrice(grandTotal.getText());
    }


}

