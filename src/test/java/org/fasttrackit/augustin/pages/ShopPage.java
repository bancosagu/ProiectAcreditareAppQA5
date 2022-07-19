package org.fasttrackit.augustin.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class ShopPage extends PageObject {


    @FindBy(css = "[aria-label='Add “Belt” to your cart']")
    private WebElementFacade addToCartBelt;
    @FindBy(css = "[aria-label='Add “Cap” to your cart']")
    private WebElementFacade addToCartCap;
    @FindBy(css = "[aria-label='Select options for “Hoodie”']")
    private WebElementFacade sellectOptionsForHoodie;
    @FindBy(id = "pa_color")
    private WebElementFacade clickColorDropdown;
    @FindBy(css = "#pa_color > option:nth-of-type(3)")
    private WebElementFacade clickGreenColor;
    @FindBy(id = "logo")
    private WebElementFacade clickLogoDropdown;
    @FindBy(css = "#logo > option:nth-of-type(2)")
    private WebElementFacade clickYes;
    @FindBy(css = ".single_add_to_cart_button")
    private WebElementFacade addToCartHoodie;
    @FindBy(css = "[aria-label='Add “Beanie” to your cart']")
    private WebElementFacade addToCartBeanie;

    public void addProductBeltToCart(){clickOn(addToCartBelt);}
    public void addProductCapToCart(){clickOn(addToCartCap);}
    public void clickSelectOptionsForHoodie(){clickOn(sellectOptionsForHoodie);}
    public void setClickColorDropdown(){clickOn(clickColorDropdown);}
    public void setClickGreenColor(){clickOn(clickGreenColor);}
    public void setClickLogoDropdown(){clickOn(clickLogoDropdown);}
    public void setClickYes(){clickOn(clickYes);}
    public void addProductHoodieToCart(){clickOn(addToCartHoodie);}
    public void addProductBeanieToCart(){clickOn(addToCartBeanie);}

}
