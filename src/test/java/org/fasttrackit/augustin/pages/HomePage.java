package org.fasttrackit.augustin.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa5.fasttrackit.org:8008/")

public class HomePage extends PageObject {

    @FindBy(id = ".searchform [name=s]")
    private WebElementFacade searchField;
    @FindBy(css = ".search-form .searchsubmit ")
    private WebElementFacade searchIcon;
    @FindBy(id = "menu-item-70")
    private WebElementFacade myAccountLink;
    @FindBy(id = "menu-item-71")
    private WebElementFacade checkoutLink;
    @FindBy(id = "menu-item-72")
    private WebElementFacade cartLink;
    @FindBy(id = "menu-item-73")
    private WebElementFacade shopLink;




    public void setSearchField(String keyword){typeInto(searchField, keyword);}
    public void clickSearchIcon(){clickOn(searchIcon);}
    public void clickMyAccountLink(){clickOn(myAccountLink);}
    public void clickCheckoutLink(){clickOn(checkoutLink);}
    public void clickCartLink(){clickOn(cartLink);}
    public void clickShopLink(){clickOn(shopLink);}

}
