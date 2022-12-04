package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddMultipleStudents extends PageInitializer {

    @When("enters admission NO {int}")
    public void enters_admission_NO(Integer int1) {

        enablingStepImpl.admittingStudent();
    }

    @Then("user is shown confirmation message {string}")
    public void user_is_shown_confirmation_message(String s) {
        // Write code here that turns the phrase above into concrete actions
    }
}
