package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.StudentInformationStepImpl;
import cucumber.api.java.en.Then;

public class StudentInformationModuleStepDefinitions extends PageInitializer {

    @Then("user sees modules under Student Information Module : {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_sees_modules_under_Student_Information_Module(String expectedStudentDetails,
            String expectedStudentAdmission, String expectedDisabledStudents, String expectedBulkDelete,
            String expectedStudentCategories,
            String expectedstudentHouse, String expectedDisableReason) {

        StudentInformationStepImpl.studentInformationModulesAreDisplayed(expectedStudentDetails,
                expectedStudentAdmission, expectedDisabledStudents, expectedBulkDelete, expectedStudentCategories,
                expectedstudentHouse, expectedDisableReason);

    }

}
