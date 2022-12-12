package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateCreateNewAgentStepDefinitions extends PageInitializer {
    @When("user clicks on Agents")
    public void user_clicks_on_Agents() {
        realEstateHomePage.agentsButton.click();
    }

    @When("clicks on my account icon")
    public void clicks_on_my_account_icon() {
        realEstateHomePage.accountIcon.click();
    }

    @When("clicks on My profile")
    public void clicks_on_My_profile() {
        realEstateHomePage.myProfileButton.click();
    }

    @Then("confirms user is loged in with new email {string}")
    public void confirms_user_is_loged_in_with_new_email(String expectedEmail) {
        String actualEmail = realEstateHomePage.emailMyProfileTextBox.getText();
        CommonUtils.assertEquals(actualEmail, expectedEmail);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}