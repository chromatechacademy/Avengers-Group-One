package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateProjectsStepImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateProjectsStepDefinitions extends PageInitializer {
    @When("clicks on Projects button")
    public void clicks_on_Projects_button() {
        realEstateHomePage.projectsButton.click();
    }

    @Then("user sees following text {string},{string},{string},{string}")
    public void user_sees_following_text(String expectedAddNewProject, String expectedProjects, String expectedActive,
            String expectedArchived) {
        RealEstateProjectsStepImpl.optionsUnderProjectsButton(expectedAddNewProject, expectedProjects, expectedActive,
                expectedArchived);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("Clicks on Sold")
    public void clicks_on_Sold() {
        realEstateHomePage.soldButton.click();
        CommonUtils.sleep(2000);
    }

    @When("confirms header has tabs:{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string} under SOLD")
    public void confirms_header_has_tabs_under_SOLD(String expectedIdSold, String expectedProjectSold,
            String expectedPriceSold, String expectedBedsSold, String expectedBathsSold, String expectedCarsSold,
            String expectedCarLotsSold, String expectedStorageLotsSold, String expectedLevelSold,
            String expectedAspectSold, String expectedTotalAreaSold, String expectedStatusSold,
            String expectedSoldBySold) {
        RealEstateProjectsStepImpl.assertTabsInSoldTable(expectedIdSold, expectedProjectSold, expectedPriceSold,
                expectedBedsSold, expectedBathsSold, expectedCarsSold, expectedCarLotsSold, expectedStorageLotsSold,
                expectedLevelSold, expectedAspectSold, expectedTotalAreaSold, expectedStatusSold, expectedSoldBySold);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("closes this table")
    public void closes_this_table() {
        realEstateHomePage.closeSold.click();
    }

    @When("clicks on Reserved")
    public void clicks_on_Reserved() {
        realEstateHomePage.reservedButton.click();
        CommonUtils.sleep(2000);
    }

    @Then("confirms header has tabs:{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string} under RESERVED")
    public void confirms_header_has_tabs_under_RESERVED(String expectedIdReserved, String expectedProjectReserved,
            String expectedPriceReserved, String expectedBedsReserved, String expectedBathsReserved,
            String expectedCarsReserved,
            String expectedCarLotsReserved, String expectedStorageLotsReserved, String expectedLevelReserved,
            String expectedAspectReserved, String expectedTotalAreaReserved, String expectedStatusReserved,
            String expectedReservedByReserved) {

        RealEstateProjectsStepImpl.assertTabsInReservedTable(expectedIdReserved, expectedProjectReserved,
                expectedPriceReserved, expectedBedsReserved, expectedBathsReserved, expectedCarsReserved,
                expectedCarLotsReserved, expectedStorageLotsReserved, expectedLevelReserved, expectedAspectReserved,
                expectedTotalAreaReserved, expectedStatusReserved, expectedReservedByReserved);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}