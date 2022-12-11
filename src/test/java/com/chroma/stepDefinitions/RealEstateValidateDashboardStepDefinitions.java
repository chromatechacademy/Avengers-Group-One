package com.chroma.stepDefinitions;

import com.chroma.stepsImplementation.RealEstateDashboardStepImpl;
import com.chroma.utils.CucumberLogUtils;
import cucumber.api.java.en.Then;

public class RealEstateValidateDashboardStepDefinitions {

    @Then("the text elements {string} ,{string} , {string}, {string}, {string}, {string} display on the Dashboard")
    public void the_text_elements_display_on_the_Dashboard(String expectedDashboardTextElement,
            String expectedHelloAdminTextElement, String expectedOverviewTextElement,
            String expectedAgentsGraphTextElement, String expectedPropertiesOverviewTextElement,
            String expectedPropertiesTextElement) {
        RealEstateDashboardStepImpl.realEstateDashboardTextElementAssert(expectedDashboardTextElement,
                expectedHelloAdminTextElement, expectedOverviewTextElement, expectedAgentsGraphTextElement,
                expectedPropertiesOverviewTextElement, expectedPropertiesTextElement);

    }

    @Then("the tabs {string} , {string} display")
    public void the_tabs_Dashboard_display(String expectedAgentsTab, String expectedDashboardTab) {
        RealEstateDashboardStepImpl.realEstateDashboardTabAssert(expectedAgentsTab, expectedDashboardTab);

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

}
