package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.AcademicsModuleVerificationStepImpl;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AcademicsModuleVerificationStepDef extends PageInitializer {

    // Clicking on Academics Module
    @When("user clicks on the Academics Module")
    public void user_clicks_on_the_Academics_Module() {
        AcademicsModuleVerificationStepImpl.clickingOnAcademicModule();
    }

    // Asserting the text of buttons under Academics module
    @Then("the following sections appears {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_sections_appears(String classTimetable, String teachersTimetable,
            String assignClassTeacher, String promoteStudents,
            String subjectGroup, String subjects, String classModule, String sections) {
        AcademicsModuleVerificationStepImpl.assertingAcademicsModule(
                classTimetable, teachersTimetable, assignClassTeacher, promoteStudents, subjectGroup, subjects,
                classModule, sections);
    }
}
