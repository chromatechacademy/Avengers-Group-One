package com.chroma.stepDefinitions;

import org.openqa.selenium.WebElement;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.When;

public class AddMultipleStudents extends PageInitializer {
    @When("enters admission NO {string}\"")
    public void enters_admission_NO(String admissionNumber) {
        CommonUtils.sleep(3000);
        studentAdmissionPage.admissionNumberTextBox.sendKeys(admissionNumber);
    }

    @When("enters First Name {string}\"")
    public void enters_First_Name(String firstName) {
        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
    }

    @When("user selects Class {string}")
    public void user_selects_Class(String classDropDownMenuAdmissionPage) {
        //CommonUtils.selectDropDownValue(classDropDownMenuAdmissionPage, studentAdmissionPage.classDropDownMenu);
         WebElement classDropDowns = studentDetails.selectClass;
         CommonUtils.selectDropDownValue(classDropDowns, 1);
    }

    @When("selects Section {string}")
    public void selects_Section(String sectionDropDownMenuAdmissionPage) {
       // CommonUtils.selectDropDownValue(sectionDropDownMenuAdmissionPage, studentAdmissionPage.sectionDropDownMenu);
        WebElement sectionDropDowns = studentDetails.selectSection;
        CommonUtils.selectDropDownValue(sectionDropDowns, 1);
    }

    @When("selects Gender {string}")
    public void selects_Gender(String femaleGenderDropDown) {
        WebElement genderDropDown = studentAdmissionPage.genderDropDownMenu;
        CommonUtils.selectDropDownValue(genderDropDown, 2);
    }

    @When("clicks on Date of Birth {string}")
    public void clicks_on_Date_of_Birth(String birthdayDate) {
        studentAdmissionPage.DOBDropDownCalendar.click();
        studentAdmissionPage.DOBDateSelection.click();
    }

    @When("selects If Guardian Is {string}")
    public void selects_If_Guardian_Is(String guardianBtn) {
        studentAdmissionPage.guardianRadioButton.click();
    }

    @When("user enters Guardian Name {string}")
    public void user_enters_Guardian_Name(String guardianName) {
        studentAdmissionPage.guardianNameTextBox.sendKeys(guardianName);
    }

    @When("enters Guardian Phone {string}")
    public void enters_Guardian_Phone(String guardianPhoneNum) {
        studentAdmissionPage.guardianPhoneTextBox.sendKeys(guardianPhoneNum);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
