package com.chroma.stepDefinitions;
import org.openqa.selenium.WebElement;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.LoginStepsImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnablingStepDef extends PageInitializer {

    @Given("a user logged in on the {string}")
    public void a_user_logged_in_on_the(String url) {

        WebDriverUtils.driver.get(url);
        LoginStepsImpl.login("general@teacher.com", "123456");     
    }

    @When("a student is disabled")
    public void a_student_is_disabled() throws InterruptedException {
       
        studentDetails.stDetails.click();
        WebElement classDropDown = studentDetails.selectClass; 
        CommonUtils.selectDropDownValue(classDropDown, 1);
        WebElement sectionDropDown = studentDetails.selectSection; 
        CommonUtils.selectDropDownValue(sectionDropDown, 3);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
       
        studentDetails.searchButton.click();
        studentDetails.student.click();
        studentDetails.thumbsDown.click();
        CommonUtils.sleep(3000);
        CommonUtils.acceptAlert();
        CommonUtils.sleep(3000);
        WebElement reasonDropDown = studentDetails.selectReason; 
        CommonUtils.selectDropDownValue(reasonDropDown, 2); 
        Thread.sleep(2000);
        studentDetails.saveBtn.click();
        CommonUtils.sleep(2000);
    }

    @Then("a student can be enabled again")
    public void a_student_can_be_enabled_again() throws InterruptedException {
        
        studentDetails.thumbsUp.click();
        CommonUtils.acceptAlert();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    } 
}
