package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class DuplicateStudentAdmissionStepDefinitions extends PageInitializer {

    @Then("error message {string} is displayed")
    public void error_message_is_displayed(String actualDuplicateStudentErrorMessage) {
        String expectedDuplicateStudentErrorMessage = studentAdmissionPage.expectedDuplicateStudentErrorMessage
                .getText();
        CommonUtils.assertEquals(actualDuplicateStudentErrorMessage, expectedDuplicateStudentErrorMessage);
        CucumberLogUtils.logExtentScreenshot();

    }

}
