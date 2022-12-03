package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.SelectCriteriaPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectCriteriaPageStepDefinitions extends PageInitializer {

    @When("user navigates to Student Information page")
    public void user_navigates_to_Student_Information_page() {
        selectCriteriaPage.studentInformationModule.click();
        CommonUtils.sleep(2000);
    }

    @When("navigates to Select Criteria page")
    public void navigates_to_Select_Criteria_page() {
        selectCriteriaPage.studentDetailsPage.click();
        CommonUtils.sleep(2000);
    }

    @When("clicks on dropdowns Class and selects {string}")
    public void clicks_on_dropdowns_Class_and_selects(String dropDownClass) {
        CommonUtils.selectDropDownValue(selectCriteriaPage.classDropDown, dropDownClass);
    }

    @When("clicks on dropdown Section and selects {string}")
    public void clicks_on_dropdown_Section_and_selects(String dropDownSection) {
        CommonUtils.selectDropDownValue(selectCriteriaPage.classDropDown, dropDownSection);
    }

    @When("clicks on search button")
    public void clicks_on_search_button() {
        selectCriteriaPage.searchBtn.click();
}

    @When("user creates admission with an existing number")
    public void user_creates_admission_with_an_existing_number() {

        CommonUtils.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("user gets an error message requiring unique admission number")
    public void user_gets_an_error_message_requiring_unique_admission_number() {

        CommonUtils.sleep(2000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

}
