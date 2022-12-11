package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.HumanResourceStepImpl;
import com.chroma.utils.CucumberLogUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HumanResourceStepDefinitions extends PageInitializer {
    @When("navigates to the Human Resources dropdown module")
    public void navigates_to_the_Human_Resources_dropdown_module() {
        humanResourceModulePage.humanResourceModuleButton.click();
    }

    @Then("modules {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} displays")
    public void module_displays(String expectedStaffDirectoryModule, String expectedStaffAttendanceModule, String expectedPayrollModule,
            String expectedApproveLeaveRequestModule, String expectedApplyLeaveModule, String expectedLeaveTypeModule, String expectedTeachersRatingModule, String expectedDepartmentModule,
            String expectedDesignationModule) {

        HumanResourceStepImpl.humanResourceModuleAssert(expectedStaffDirectoryModule, expectedStaffAttendanceModule, expectedPayrollModule, expectedApproveLeaveRequestModule, expectedApplyLeaveModule, expectedLeaveTypeModule, expectedTeachersRatingModule, expectedDepartmentModule, expectedDesignationModule);

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

}
