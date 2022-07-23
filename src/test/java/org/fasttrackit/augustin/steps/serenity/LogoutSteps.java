package org.fasttrackit.augustin.steps.serenity;

import net.thucydides.core.annotations.Step;

public class LogoutSteps extends BaseSteps{

    @Step
    public void logout(){
        homePage.clickLogoutButton();
    }
    @Step
    public void adminLogout(){
        adminDashboardPage.clickAdminBarMenuPop();
        adminDashboardPage.clickAdminLogoutButton();
        }


}
