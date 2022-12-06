package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClassesAndSectionStepDefinitions extends PageInitializer {

    @When("navigates to Academics module")
    public void navigates_to_Academics_module() {
        dashboardPage.academicsModule.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("navigates to Class sub module")
    public void navigates_to_Class_sub_module() {
        dashboardPage.classSubModule.click();
        CommonUtils.sleep(2000);    
    }

    @When("adds class {string} to Sample class Section")
    public void adds_class_to_Sample_class_Section(String classText) {
        addClassPage.addClassTextBox.sendKeys(classText);
        CommonUtils.sleep(2000);
        addClassPage.sampleClassTextBox.click();
        addClassPage.saveButton.click();
        CommonUtils.sleep(2000);
    }

    @When("verifies message {string}")
    public void verifies_message(String expectedText) {
        String actualText = addClassPage.recordSavedSuccessfullyText.getText();
        CommonUtils.assertEquals(expectedText, actualText);
    }

    @When("verifies class {string} was added")
    public void verifies_class_was_added(String expectedText) {
        String actualText = addClassPage.rukshanClassText.getText();
        CommonUtils.assertEquals(expectedText, actualText);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("deletes class to rerun automated test case")
    public void deletes_class_to_rerun_automated_test_case() {
        addClassPage.rukshanRecordDeleteLink.click();
        CommonUtils.sleep(2000);
        CommonUtils.acceptAlert();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}