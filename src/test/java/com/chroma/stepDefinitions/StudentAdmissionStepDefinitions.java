package com.chroma.stepDefinitions;

import org.openqa.selenium.support.ui.Select;
import com.chroma.pages.BulkDeletePage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.stepsImplementation.LoginStepsImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentAdmissionStepDefinitions {
    @Given("a user is on the CTSMS login page {string}")
    public void a_user_is_on_the_CTSMS_login_page(String url) {
        WebDriverUtils.driver.get(url);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) {
        LoginStepsImpl.login(username, password);
        CommonUtils.sleep(4000);
    }

    @When("navigates to the Student Information drop down module")
    public void navigates_to_the_Student_Information_drop_down_module() {
        DashboardPage.studentInformationModule.click();
    }

    @When("selects the Student Admission option")
    public void selects_the_Student_Admission_option() {
        StudentAdmissionPage.studentAdmissionModule.click();
    }

    @When("enters {string} to Admission No text box")
    public void enters_to_Admission_No_text_box(String admissionNumber) {
        StudentAdmissionPage.admissionNumberTextBox.sendKeys(admissionNumber);
    }

    @When("enters {string} to Roll Number text box")
    public void enters_to_Roll_Number_text_box(String rollNumber) {
        StudentAdmissionPage.rollNumberTextBox.sendKeys(rollNumber);
    }

    @When("selects {string} from the Class drop down menu")
    public void selects_from_the_Class_drop_down_menu(String classDropDownMenuAdmissionPage) {
        Select classDropDown = new Select(StudentAdmissionPage.classDropDownMenu);
        classDropDown.selectByVisibleText(classDropDownMenuAdmissionPage);
    }

    @When("selects the {string} option from the Section drop down menu")
    public void selects_the_option_from_the_Section_drop_down_menu(String sectionDropDownMenuAdmissionPage) {
        Select sectionDropDown = new Select(StudentAdmissionPage.sectionDropDownMenu);
        sectionDropDown.selectByVisibleText(sectionDropDownMenuAdmissionPage);
    }

    @When("enters {string} to the First Name text box")
    public void enters_to_the_First_Name_text_box(String firstName) {
        StudentAdmissionPage.firstNameTextBox.sendKeys(firstName);
    }

    @When("selects {string} from the Gender drop down menu")
    public void selects_from_the_Gender_drop_down_menu(String femaleGenderDropDown) {
        Select sectionGenderDropDown = new Select(StudentAdmissionPage.genderDropDownMenu);
        sectionGenderDropDown.selectByVisibleText(femaleGenderDropDown);
    }

    @When("selects date from the Date of Birth drop down calendar")
    public void selects_date_from_the_Date_of_Birth_drop_down_calendar() {
        StudentAdmissionPage.DOBDropDownCalendar.click();
        StudentAdmissionPage.DOBDateSelection.click();
    }

    @When("selects the Father radio button form the If Guardian Is section")
    public void selects_the_Father_radio_button_form_the_If_Guardian_Is_section() {
        StudentAdmissionPage.guardianRadioButton.click();
    }

    @When("enters {string} to the Guardian Name text box")
    public void enters_to_the_Guardian_Name_text_box(String guardianName) {
        StudentAdmissionPage.guardianNameTextBox.sendKeys(guardianName);
    }

    @When("enters {string} to the Guardian Phone text box")
    public void enters_to_the_Guardian_Phone_text_box(String guardianPhoneNum) {
        StudentAdmissionPage.guardianPhoneTextBox.sendKeys(guardianPhoneNum);
    }

    @When("clicks the Save button")
    public void clicks_the_Save_button() {
        StudentAdmissionPage.saveButton.click();
        CommonUtils.sleep(2000);
    }

    // @Then("student is admitted and {string} is displayed")
    // public void student_is_admitted_and_is_displayed(String
    // recordSavedSuccessfullyText) {
    // String studentAdmittedAssertion =
    // StudentAdmissionPage.recordSavedAssertion.getText();
    // CommonUtils.assertEquals(recordSavedSuccessfullyText,
    // studentAdmittedAssertion);
    // CucumberLogUtils.logScreenShot();
    // CucumberLogUtils.logExtentScreenshot();
    // }

    @When("selects Bulk Delete from the Student Information module")
    public void selects_Bulk_Delete_from_the_Student_Information_module() {
        BulkDeletePage.bulkDeleteModule.click();
    }

    @When("selects the {string} option from the Class drop down menu")
    public void selects_the_option_from_the_Class_drop_down_menu(String classDropDownMenuBulkDeletePage) {
        Select classDropDown = new Select(BulkDeletePage.classDropDownMenu);
        classDropDown.selectByVisibleText(classDropDownMenuBulkDeletePage);
    }

    @When("selects {string} from the Section drop down menu")
    public void selects_from_the_Section_drop_down_menu(String sectionDropDownMenuBulkDeletePage) {
        Select sectionDropDown = new Select(BulkDeletePage.sectionDropDownMenu);
        sectionDropDown.selectByVisibleText(sectionDropDownMenuBulkDeletePage);
    }

    @When("clicks the Search button")
    public void clicks_the_Search_button() {
        BulkDeletePage.selectSearchButton.click();
    }

    @When("enters the Admission Number {string} to the search text box")
    public void enters_the_Admission_Number_to_the_search_text_box(String admissionNumber) {
        BulkDeletePage.searchAdmissisonNumber.sendKeys(admissionNumber);
    }

    @When("selects the check box for the desired student")
    public void selects_the_check_box_for_the_desired_student() {
        BulkDeletePage.checkBoxToDelete.click();
    }

    @When("clicks the Delete button")
    public void clicks_the_Delete_button() {
        BulkDeletePage.deleteButton.click();
    }

    @Then("clicks the OK button in the pop up window")
    public void clicks_the_OK_button_in_the_pop_up_window() {
        WebDriverUtils.driver.switchTo().alert().accept();
    }

}
