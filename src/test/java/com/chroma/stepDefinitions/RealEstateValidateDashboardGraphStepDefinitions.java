package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateValidateDashboardGraphStepImpl;
import com.chroma.utils.CucumberLogUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateValidateDashboardGraphStepDefinitions extends PageInitializer {
    @When("user navigates to {string} on the Dashboard")
    public void user_navigates_to_on_the_Dashboard(String dashboardOption) {
        RealEstateValidateDashboardGraphStepImpl.dashboardOption(dashboardOption).click();
    }

    @Then("the graph displays with header text {string}")
    public void the_graph_displays_with_header_text(String expectedGraphHeaderText) {
        RealEstateValidateDashboardGraphStepImpl.graphHeaderTextAssert(expectedGraphHeaderText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}