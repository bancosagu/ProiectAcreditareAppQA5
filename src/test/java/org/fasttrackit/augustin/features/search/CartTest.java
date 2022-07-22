package org.fasttrackit.augustin.features.search;
import org.junit.Test;

public class CartTest extends BaseTest{


    @Test
    public void searchAndAddToCart(){
        searchSteps.doSearch("beanie");
        cartSteps.addSearchedProductToCart("beanie");
    }

    @Test
    public void addSearchedProductToCart(){
        searchSteps.doSearch("Beanie");
        cartSteps.addProductFromListToCart("Beanie");
    }


    @Test
    public void addToCartTest(){
        cartSteps.addBeltAndCapToCartAndCheckPrice();
    }





//    addToCartAndChangeQuantity

//  Discounted price displayed in shop is the same in the cart


//    @Test
//    public void emptyCart(){}
}
