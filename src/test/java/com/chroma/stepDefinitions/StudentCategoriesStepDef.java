package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentCategoriesStepDef extends PageInitializer {

    @When("clics Student Admission")
    public void clics_Student_Admission() {
        studentCategoriesPage.studentadmission.click();
    }

    @When("navigates to Student categories")
    public void navigates_to_Student_categories() {
        studentCategoriesPage.studentcategories.click();
    }

    @When("user enters {string} in Category TextBox")
    public void user_enters_in_Category_TextBox(String categoryName) {
        studentCategoriesPage.categoryTxtBox.sendKeys(categoryName);
        CommonUtils.sleep(2000);
    }

    @When("clicks save and new category is added {string}")
    public void clicks_save_and_new_category_is_added(String successfullyAdded) {
        studentCategoriesPage.saveBtn.click();
        String recordSaveSuccessfully = studentCategoriesPage.saveSuccessfullyText.getText();
        CommonUtils.assertEquals(successfullyAdded, recordSaveSuccessfully);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("clicks delete")
    public void clicks_delete() {
        studentCategoriesPage.deleteBtn.click();
        CommonUtils.acceptAlert();
        CommonUtils.sleep(2000);
    }

    @Then("new category is deleted {string}")
    public void new_category_is_deleted(String successfullyDeleted) {
        String recordDeleteSuccessfully = studentCategoriesPage.deleteSuccessfullyText.getText();
        CommonUtils.assertEquals(successfullyDeleted, recordDeleteSuccessfully);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
