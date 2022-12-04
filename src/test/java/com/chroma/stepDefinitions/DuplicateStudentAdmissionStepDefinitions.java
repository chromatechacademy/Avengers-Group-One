package com.chroma.stepDefinitions;

import org.testng.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DuplicateStudentAdmissionStepDefinitions extends PageInitializer {

    @When("user navigates to Student Information page")
    public void user_navigates_to_Student_Information_page() {
        duplicateStudentAdmissionPage.studentInformationModule.click();
        CommonUtils.sleep(2000);
    }

    @Then("user gets an error message {string}")
    public void user_gets_an_error_message(String expectedStudentDuplicateErrorMsg) {
        System.out.println(duplicateStudentAdmissionPage.addErrorMsg.getText());
        boolean isDuplicate = duplicateStudentAdmissionPage.addErrorMsg.getText().contentEquals(expectedStudentDuplicateErrorMsg);
        Assert.assertTrue(isDuplicate);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
