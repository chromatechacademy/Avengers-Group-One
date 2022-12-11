package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.NavigationModuleStepImpl;
import cucumber.api.java.en.Then;

public class NavigationModuleStepDefinitions extends PageInitializer {

    @Then("user sees Module: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_sees_Module(String expectedStudentInformationModule, String expectedFeesCollection,
            String expectedIncome, String expectedExpences, String expectedAcademics, String expectedHumanResource,
            String expectedHomework, String exectedReports) {

        NavigationModuleStepImpl.navigationModulesAreDisplayed(expectedStudentInformationModule, expectedFeesCollection,
                expectedIncome, expectedExpences, expectedAcademics, expectedHumanResource, expectedHomework,
                exectedReports);

    }

}
