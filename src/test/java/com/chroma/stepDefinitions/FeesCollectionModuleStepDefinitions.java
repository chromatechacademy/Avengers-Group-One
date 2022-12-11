package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.FeesCollectionModuleStepImpl;
import com.chroma.utils.CucumberLogUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeesCollectionModuleStepDefinitions extends PageInitializer {
    @When("navigates to the Fees Collection dropdown module")
    public void navigates_to_the_Fees_Collection_dropdown_module() {
        feesCollectionModulePage.feesCollectionModuleButton.click();
    }

    @Then("modules {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} display in the drop down")
    public void modules_display_in_the_drop_down(String expectedCollectFeesModule,
            String expectedSearchFeesPaymentModule, String expectedSearchDueFeesModule, String expectedFeesMasterModule,
            String expectedFeesGroupModule, String expectedFeesTypeModule, String expectedFeesDiscountModule,
            String expectedFeesCarryForwardModule, String expectedFeesReminderModule) {

        FeesCollectionModuleStepImpl.feesCollectionModuleAssert(expectedCollectFeesModule, expectedSearchFeesPaymentModule, expectedSearchDueFeesModule, expectedFeesMasterModule, expectedFeesGroupModule, expectedFeesTypeModule, expectedFeesDiscountModule, expectedFeesCarryForwardModule, expectedFeesReminderModule);

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

}
