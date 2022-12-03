package com.chroma.stepDefinitions;

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
        CommonUtils.sleep(2000);
    }

    @Then("user is directed to dashboard page and sees {string} text")
    public void user_is_directed_to_dashboard_page_and_sees_text(String successfulLoginText) {
        String isChromaTechTextDisplayed = dashboardPage.chromaTechAcademyText.getText();
        CommonUtils.assertEquals(successfulLoginText, isChromaTechTextDisplayed);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("user sees {string} message")
    public void user_sees_message(String invalidUsernameOrPasswordText) {
        String isInvalidUsernameOrPasswordTextDisplayed = loginPage.invalidUsernameOrPasswordText.getText();
        CommonUtils.assertEquals(invalidUsernameOrPasswordText, isInvalidUsernameOrPasswordTextDisplayed);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
