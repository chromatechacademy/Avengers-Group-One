package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.LoginStepsImpl;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnablingStepDef extends PageInitializer {

    @Given("a user logged in on the {string} with valid credentials {string}  and {string}")
    public void a_user_logged_in_on_the_with_valid_credentials_and(String url, String username, String password) {
        WebDriverUtils.driver.get(url);
        LoginStepsImpl.login(username, password);
    }

    @When("a student is disabled")
    public void a_student_is_disabled() throws InterruptedException {
        studentAdmissionPage.studentAdmissionModule.click();
        enablingStepImpl.admittingStudent();
        enablingStepImpl.studentDetails();
        enablingStepImpl.disablingStudent();    
    }

    @Then("a student can be enabled again")
    public void a_student_can_be_enabled_again() throws InterruptedException {
        enablingStepImpl.enablingStudent();
        enablingStepImpl.deleteStudent();   
         
    }
}
