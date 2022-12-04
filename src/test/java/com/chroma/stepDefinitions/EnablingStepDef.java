package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.LoginStepsImpl;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EnablingStepDef extends PageInitializer {
    @Given("a user logged in on the {string} with valid credentials {string}  and {string}")
    public void a_user_logged_in_on_the_with_valid_credentials_and(String url, String username, String password) {
        WebDriverUtils.driver.get(url);
        LoginStepsImpl.login(username, password);
    }

    @Given("a student is disabled in {string} Class and {string} Section")
    public void a_student_is_disabled_in_Class_and_Section(String SDET, String DatabaseTesting) {
        studentAdmissionPage.studentAdmissionModule.click();
        enablingStepImpl.admittingStudent(SDET, DatabaseTesting);
        enablingStepImpl.studentDetails(SDET);
        enablingStepImpl.disablingStudent();
    }

    @Then("a student can be enabled again in {string} Class")
    public void a_student_can_be_enabled_again_in_Class(String SDET) {
        enablingStepImpl.enablingStudent();
        enablingStepImpl.deleteStudent(SDET);
    }
}
