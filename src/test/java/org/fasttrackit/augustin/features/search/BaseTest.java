package org.fasttrackit.augustin.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.augustin.steps.serenity.LoginSteps;
import org.fasttrackit.augustin.steps.serenity.RegisterSteps;
import org.fasttrackit.augustin.steps.serenity.SearchSteps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    protected LoginSteps loginSteps;
    protected SearchSteps searchSteps;
    protected RegisterSteps registerSteps;



}
