package org.fasttrackit.augustin.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.augustin.pages.HomePage;

public class SearchSteps extends BaseSteps {



    @Step
    public void navigateToHomepage(){homePage.open();}

    @Step
    public void setSearch(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickSearchIcon();}


    @Step
    public void doSearch(String keyword){
        navigateToHomepage();
        setSearch(keyword);



    }
}
