package com.chroma.stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.AgentPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.lu.a;

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

    @When("logs into the agent website with the new agents credentials {string}, {string}")
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

    }

    @Then("logs into the website with the new agents credentials")
    public void logs_into_the_website_with_the_new_agents_credentials() {

    }

    @Then("the following text displays {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_text_displays(String active, String inactive, String allAgents, String name, String mail,
            String contactNumber, String actions, String addNow) {
        CommonUtils.waitForVisibility(agentPage.allAgentButton);
        Assert.assertEquals(active, agentPage.activeButton.getText().trim());
        Assert.assertEquals(inactive, agentPage.inactiveButton.getText().trim());
        Assert.assertEquals(allAgents, agentPage.allAgentButton.getText().trim());
        Assert.assertEquals(name, agentPage.nameButton.getText().trim());
        Assert.assertEquals(mail, agentPage.mailButton.getText().trim());
        Assert.assertEquals(contactNumber, agentPage.contactNumberButton.getText().trim());
        Assert.assertEquals(actions, agentPage.actionButton.getText().trim());
        Assert.assertEquals(addNow, agentPage.addNowButton.getText().trim());
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

}
