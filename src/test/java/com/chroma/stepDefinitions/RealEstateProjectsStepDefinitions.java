package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateProjectsStepImpl;
import com.chroma.utils.CucumberLogUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateProjectsStepDefinitions extends PageInitializer {
    @When("clicks on Projects button")
    public void clicks_on_Projects_button() {
        realEstateHomePage.projectsButton.click();
    }

    @Then("user sees following text {string},{string},{string},{string}")
    public void user_sees_following_text(String expectedAddNewProject, String expectedProjects, String expectedActive,
            String expectedArchived) {
        RealEstateProjectsStepImpl.optionsUnderProjectsButton(expectedAddNewProject, expectedProjects, expectedActive, expectedArchived);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

}