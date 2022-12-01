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

    @When("user logs in with email {string} and password {string}")
    public void user_logs_in_with_email_and_password(String username, String password) {
        LoginStepsImpl.login(username, password);
        CommonUtils.sleep(5000);
    }

    @Then("user is directed to dashboard page")
    public void user_is_directed_to_dashboard_page() {
        boolean isChromaTechTextDisplayed = dashboardPage.chromaTechAcademyText.isDisplayed();
        Assert.assertTrue(isChromaTechTextDisplayed);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("user sees Invalid Username or Password message")
    public void user_sees_Invalid_Username_or_Password_message() {
        boolean isInvalidUsernameOrPasswordTextDisplayed = loginPage.invalidUsernameOrPasswordText.isDisplayed();
        Assert.assertTrue(isInvalidUsernameOrPasswordTextDisplayed);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
