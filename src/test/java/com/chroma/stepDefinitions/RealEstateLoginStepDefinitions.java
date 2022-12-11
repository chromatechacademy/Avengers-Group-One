package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateLoginStepImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateLoginStepDefinitions extends PageInitializer{
    
    @Given("a user is on the Chroma Tech Academy Real Estate Login page {string}")
    public void a_user_is_on_the_Chroma_Tech_Academy_Real_Estate_Login_page(String realEstateURL) {
        WebDriverUtils.driver.get(realEstateURL);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
    
    @When("user logs in with the valid credentials email {string} and password {string}")
    public void user_logs_in_with_the_valid_credentials_email_and_password(String realEstateLoginEmail, String realEstateLoginPassword) {
      RealEstateLoginStepImpl.realEstateLogin(realEstateLoginEmail, realEstateLoginPassword);
    }
    
    @Then("{string} header displays")
    public void header_displays(String helloAdminText) {
        String isHelloAdminTextDisplayed = realEstateLoginPage.realEstateLoginHelloAdminText.getText();
        CommonUtils.assertEquals(helloAdminText, isHelloAdminTextDisplayed);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }





















}
