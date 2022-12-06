package com.chroma.stepDefinitions;


import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AgentPageStepDef extends PageInitializer {

    @When("verifies a unique agent has been added wih {string}, {string}, {string}, {string}, {string}")
    public void verifies_a_unique_agent_has_been_added_wih(String firstName, String lastName, String phoneNumber,
            String email, String password) throws InterruptedException {
        CommonUtils.waitForClickability(agentPage.agentsButton);
        agentPage.agentsButton.click();
        agentPage.addNowButton.click();
        agentPage.firstNameBox.sendKeys(firstName);
        agentPage.lastNameBox.sendKeys(lastName);
        agentPage.phoneBox.sendKeys(phoneNumber);
        agentPage.emailNameBox.sendKeys(email);
        agentPage.passwordBox.sendKeys(password);
        agentPage.retypePassBox.sendKeys(password);
        agentPage.saveButton.click();
        Thread.sleep(4000);
        agentPage.backButton.click();
        WebDriverUtils.driver.navigate().refresh();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
    /*@When("logs into the agent website with the new agents credentials {string}, {string}")
    public void logs_into_the_agent_website_with_the_new_agents_credentials(String email, String password) {
        WebDriverUtils.driver.get("https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/login.php");
        CommonUtils.waitForVisibility(agentPage.userNameTextbox);
        agentPage.userNameTextbox.sendKeys(email);
        agentPage.passwordTextbox.sendKeys(password);
        agentPage.loginButton.click();
        CommonUtils.waitForVisibility(agentPage.dashboardButton);
        WebDriverUtils.driver
                .get("https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php");
        agentPage.userNameTextbox.sendKeys("admin@mexil.it");
        agentPage.passwordTextbox.sendKeys("123456");
        agentPage.loginButton.click();
        CommonUtils.waitForVisibility(agentPage.dashboardButton);
        agentPage.agentsButton.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }*/

    @Then("the following text displays {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_text_displays(String expectedActiveText, String expectedInactiveText, String expectedAllAgentsText, String expectedName, String expectedMail,
            String expectedContactNumber, String expectedActions, String expectedAddNow) {
                String actualActiveText = agentPage.activeButton.getText();
                String actualInactiveText = agentPage.inactiveButton.getText();
                String actualAllAgentsText = agentPage.allAgentButton.getText();
                String actualName = agentPage.nameButton.getText();
                String actualMail = agentPage.mailButton.getText();
                String actualContactNumber = agentPage.contactNumberButton.getText();
                String actualActions = agentPage.actionButton.getText();
                String actualAddNow = agentPage.addNowButton.getText();
        CommonUtils.waitForVisibility(agentPage.allAgentButton);
        CommonUtils.assertEquals(expectedActiveText,actualActiveText);
        CommonUtils.assertEquals(expectedInactiveText,actualInactiveText);
        CommonUtils.assertEquals(expectedAllAgentsText,actualAllAgentsText);
        CommonUtils.assertEquals(expectedName,actualName);
        CommonUtils.assertEquals(expectedMail,actualMail);
        CommonUtils.assertEquals(expectedContactNumber, actualContactNumber);
        CommonUtils.assertEquals(expectedActions, actualActions);
        CommonUtils.assertEquals(expectedAddNow, actualAddNow);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

}
