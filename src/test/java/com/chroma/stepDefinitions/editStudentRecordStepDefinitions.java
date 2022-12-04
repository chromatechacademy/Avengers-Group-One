package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditStudentRecordStepDefinitions extends PageInitializer {

    @When("user navigates to Student Details")
    public void user_navigates_to_Student_Details() {
        editStudentRecordPage.studentDetailsModule.click();
        CommonUtils.sleep(2000);
    }

    @When("clicks on search button")
    public void clicks_on_search_button() {
        editStudentRecordPage.searchBtn.click();

    }

    @When("user clicks on edit under action")
    public void user_clicks_on_edit_under_action() {
        editStudentRecordPage.editbtn.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("edits the Admission Number {string} to the text box")
    public void edits_the_Admission_Number_to_the_text_box(String admissionTextBox) {
        editStudentRecordPage.admissionTextBox.getText();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
   

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        editStudentRecordPage.saveButton.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user changes are saved")
     public void user_changes_are_saved() {
         editStudentRecordPage.recordUpdateSuccessfullyText.getText();
    }

}
