package org.fasttrackit.augustin.features.search;
import org.junit.Test;


public class SearchTest extends BaseTest {



    String keyword = "Beanie";

    @Test
    public void searchTest(){
        searchSteps.navigateToHomepage();
        searchSteps.setSearch(keyword);
        searchSteps.checkSearchPageBreadcrumb(keyword);
        searchSteps.verifyForSearchedProductInResultList(keyword);
     }

//     search for unrelated keyword and see results
//    search using only part of the product name
    

}
