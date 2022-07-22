package org.fasttrackit.augustin.pages;

import net.thucydides.core.pages.PageObject;

public class BasePage extends PageObject {



    public int getIntFromPrice(String priceNonFormated){
        return Integer.parseInt(priceNonFormated
                .replace(",","")
                .replace("lei","")
                .replace(".",""));
    }
}
