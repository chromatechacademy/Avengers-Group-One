package com.chroma.stepDefinitions;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.When;

public class AddMultipleStudentsStepDef extends PageInitializer {
  @When("enters admission NO {string}")
  public void enters_admission_NO(String admissionNO) {
    multipleStudentsPage.admissionNumberTextBox.sendKeys(admissionNO);
  }

  @When("enters First Name {string}")
  public void enters_First_Name(String firstName) {
    multipleStudentsPage.firstNameTextBox.sendKeys(firstName);
  }

  @When("user selects Class {string}")
  public void user_selects_Class(String classDropDownMenuAdmissionPage) {
    CommonUtils.selectDropDownValue(classDropDownMenuAdmissionPage, studentAdmissionPage.classDropDownMenu);
  }

  @When("selects Section {string}")
  public void selects_Section(String sectionDropDownMenuAdmissionPage) {
    CommonUtils.selectDropDownValue(sectionDropDownMenuAdmissionPage, studentAdmissionPage.sectionDropDownMenu);
    CommonUtils.sleep(2000);
  }

  @When("selects Gender {string}")
  public void selects_Gender(String gender) {
    CommonUtils.selectDropDownValue(studentAdmissionPage.genderDropDownMenu, gender);
  }

  @When("clicks on Date of Birth {string}")
  public void clicks_on_Date_of_Birth(String dateOfBirth) {
    studentAdmissionPage.DOBDropDownCalendar.click();
    studentAdmissionPage.DOBDateSelection.click();
  }

  @When("selects If Guardian Is {string}")
  public void selects_If_Guardian_Is(String ifGuardianIs) {
    multipleStudentsPage.guardianRadioButton.click();
  }

  @When("user enters Guardian Name {string}")
  public void user_enters_Guardian_Name(String guardianName) {
    multipleStudentsPage.guardianName.sendKeys(guardianName);
  }

  @When("enters Guardian Phone {string}")
  public void enters_Guardian_Phone(String guardianPhone) {
    multipleStudentsPage.guardianPhone.sendKeys(guardianPhone);
    CucumberLogUtils.logScreenShot();
    CucumberLogUtils.logExtentScreenshot();
  }
}