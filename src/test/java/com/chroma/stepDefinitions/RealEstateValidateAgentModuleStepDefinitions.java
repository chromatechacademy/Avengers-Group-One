package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateValidateAgentModuleStepImpl;
import com.chroma.utils.CucumberLogUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateValidateAgentModuleStepDefinitions extends PageInitializer {

    @When("navigates to the Agents tab")
    public void navigates_to_the_Agents_tab() {
        realEstateAgentModulePage.actualAgentsModuleButton.click();
    }

    @Then("text elements {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, are visible")
    public void text_elements_are_visible(String expectedMembersListTextElement,
            String expectedActiveTextElement, String expectedInactiveTextElement, String expectedAllAgentsTextElement,
            String expectedAddNowTextElement, String expectedNameTextElement, String expectedMailTextElement,
            String expectedContactNumberTextElement, String expectedActionsTextElement) {

        RealEstateValidateAgentModuleStepImpl.realEstateAgentModuleAssert(expectedMembersListTextElement,
                expectedActiveTextElement, expectedInactiveTextElement, expectedAllAgentsTextElement,
                expectedAddNowTextElement, expectedNameTextElement, expectedMailTextElement,
                expectedContactNumberTextElement, expectedActionsTextElement);

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }
}
