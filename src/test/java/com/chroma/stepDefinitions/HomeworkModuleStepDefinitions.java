package com.chroma.stepDefinitions;

import org.openqa.selenium.By;
import com.chroma.pages.HomeworkModulePage;
import com.chroma.stepsImplementation.LoginStepsImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeworkModuleStepDefinitions {
    @Given("a user is at the CTSMS login page {string}")
    public void a_user_is_at_the_CTSMS_login_page(String url) {
     WebDriverUtils.driver.get(url);
    }
    
    @When("user logs in with valid credentials email {string} and password {string}")
    public void user_logs_in_with_valid_credentials_email_and_password(String username, String password)  {
        LoginStepsImpl.login(username, password);
        CommonUtils.sleep(4000);
    }
    
    @When("navigates to the Homework dropdown module")
    public void navigates_to_the_Homework_dropdown_module() {
        WebDriverUtils.driver.findElement(By.xpath("//span[normalize-space()='Homework']")).click();
    }
    
    @Then("{string} displays")
    public static void displays(String expectedModuleText) {
    String addHomeworkDisplays = HomeworkModulePage.addHomeworkModuleTextDisplays.getText();
    CommonUtils.assertEquals(expectedModuleText, addHomeworkDisplays);
    CucumberLogUtils.logScreenShot();
    CucumberLogUtils.logExtentScreenshot(); 
}


    
























}
