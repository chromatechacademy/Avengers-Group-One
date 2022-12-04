package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;

import cucumber.api.java.en.When;

public class AddMultipleStudents extends PageInitializer {

    @When("enters admission NO {int}")
    public void enters_admission_NO(Integer int1) {

        enablingStepImpl.admittingStudent();
    }
}
