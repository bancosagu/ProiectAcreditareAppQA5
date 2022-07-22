package org.fasttrackit.augustin.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.augustin.steps.serenity.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    protected LoginSteps loginSteps;

    @Steps
    protected SearchSteps searchSteps;

    @Steps
    protected RegisterSteps registerSteps;

    @Steps
    protected CartSteps cartSteps;

    @Steps
    protected AdminLoginSteps adminLoginSteps;

    @Steps
    protected ProductReviewSteps productReviewSteps;

    @Steps
    protected LogoutSteps logoutSteps;

}
