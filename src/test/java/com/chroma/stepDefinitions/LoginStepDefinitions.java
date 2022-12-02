package com.chroma.stepDefinitions;

import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.LoginStepsImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions extends PageInitializer {

    @Given("a user is on the {string} Homepage")
    public void a_user_is_on_the_Homepage(String url) {
        WebDriverUtils.driver.get(url);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("user logs in with email {string} and paswword {string}")
    public void user_logs_in_with_email_and_paswword(String username, String password) throws InterruptedException {
        LoginStepsImpl.login(username, password);
        Thread.sleep(6000);
    }

    @Then("user is directed to dashboard page")
    public void user_is_directed_to_dashboard_page() {
        boolean isChromaTechTextDisplayed = dashboardPage.chromaTechAcademyText.isDisplayed();
        Assert.assertTrue(isChromaTechTextDisplayed);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Given("an admin user is on the Real Estate login page")
    public void an_admin_user_is_on_the_Real_Estate_login_page() throws InterruptedException {
        WebDriverUtils.driver
                .get("https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php");
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("user logs in with username and password")
    public void user_logs_in_with_username_and_password() throws InterruptedException {
        agentPage.userNameTextbox.sendKeys("admin@mexil.it");
        agentPage.passwordTextbox.sendKeys("123456");
        agentPage.loginButton.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("user is navigated to the agents page")
    public void user_is_navigated_to_the_agents_page() {
        CommonUtils.waitForClickability(agentPage.agentsButton);
        agentPage.agentsButton.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }
}