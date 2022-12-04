package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class editStudentRecordStepDefinitions extends PageInitializer {

    @When("user navigates to Student Details")
    public void user_navigates_to_Student_Details() {
        editStudentRecordPage.studentDetailsModule.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
    
    @When("user selects an option on class and section dropdowns and clicks search")
    public void user_selects_an_option_on_class_and_section_dropdowns_and_clicks_search() {
        
    }
    
    @Then("user is shown confirmation message {string}")
    public void user_is_shown_confirmation_message(String string) {
       
    }

}