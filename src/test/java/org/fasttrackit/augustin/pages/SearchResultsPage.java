package org.fasttrackit.augustin.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(css = ".woocommerce-breadcrumb > span")
    private WebElementFacade searchResultsBreadcrumb;

    @FindBy(css = ".wc-products")
    private List<WebElementFacade> searchResultList;

    public boolean checkListForSearchedProduct(String productName){
        for (WebElementFacade element : searchResultList){
            if(element.findElement(By.cssSelector(".post-26 .collection_title > h3")).getText().equalsIgnoreCase(productName)){
                return true;
            }
        }
        return false;
    }
    public void addSearchedProductFromListToCart(String product){
        for(WebElementFacade element :searchResultList){
            if(element.findElement(By.cssSelector(".post-26 .collection_title > h3")).isDisplayed()){
                element.findElement(By.cssSelector(".post-26 .attachment-shop_catalog")).click();
                break;
            }
        }
    }

    public void verifyIfLandedOnSearchPage(String keyword){
        searchResultsBreadcrumb.shouldContainText(keyword);
    }
}
