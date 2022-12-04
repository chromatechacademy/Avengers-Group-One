package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class duplicateStudentAdmissionStepDefinition extends PageInitializer {

    @When("user navigates to Student Information page")
    public void user_navigates_to_Student_Information_page() {
        duplicateStudentAdmissionPage.studentInformationModule.click();
        CommonUtils.sleep(2000);
    }

    @When("clicks on search button")
    public void clicks_on_search_button() {
        duplicateStudentAdmissionPage.searchBtn.click();
    }

    @When("user creates admission with an existing number")
    public void user_creates_admission_with_an_existing_number() {
        duplicateStudentAdmissionPage.admissionNumber.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user selects an existing number")
    public void user_selects_an_existing_number() {
        duplicateStudentAdmissionPage.addErrorMsg.sendKeys();
    }

    @Then("user gets an error message requiring unique admission number")
    public void user_gets_an_error_message_requiring_unique_admission_number(String expectedText) {
        String duplicateStudentAdmittedAssertion = duplicateStudentAdmissionPage.addErrorMsg.getText();
        CommonUtils.sleep(2000);
        CommonUtils.acceptAlert();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}
