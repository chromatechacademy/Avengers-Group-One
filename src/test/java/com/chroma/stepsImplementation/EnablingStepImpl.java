package com.chroma.stepsImplementation;

import org.openqa.selenium.WebElement;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.BulkDeletePage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class EnablingStepImpl extends PageInitializer {

    /**
     * Use this method to create new student
     * 
     * 
     */
    public void admittingStudent() {
        StudentAdmissionPage.admissionNumberTextBox.sendKeys("2501");
        StudentAdmissionPage.firstNameTextBox.sendKeys("Yaryna");
        WebElement classDropDowns = studentDetails.selectClass;
        CommonUtils.selectDropDownValue(classDropDowns, 1);
        WebElement sectionDropDowns = studentDetails.selectSection;
        CommonUtils.selectDropDownValue(sectionDropDowns, 1);
        WebElement genderDropDown = StudentAdmissionPage.genderDropDownMenu;
        CommonUtils.selectDropDownValue(genderDropDown, 2);
        StudentAdmissionPage.DOBDropDownCalendar.click();
        StudentAdmissionPage.DOBDateSelection.click();
        CommonUtils.sleep(3000);
        StudentAdmissionPage.guardianRadioButton.click();
        StudentAdmissionPage.guardianNameTextBox.sendKeys("Luka");
        StudentAdmissionPage.guardianPhoneTextBox.sendKeys("676954");
        StudentAdmissionPage.saveButton.click();
        CommonUtils.sleep(2000);
    }

    /**
     * Use this method to student details
     * 
     * 
     */
    public void studentDetails() {
        studentDetails.stDetails.click();
        WebElement classDropDown = studentDetails.selectClass;
        CommonUtils.selectDropDownValue(classDropDown, 1);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        studentDetails.searchButton.click();
        studentDetails.student.click();
        CommonUtils.sleep(2000);
    }

    /**
     * Use this method to delete a student
     * 
     * 
     */
    public void deleteStudent() {
        BulkDeletePage.bulkDeleteModule.click();
        WebElement classDropDown = studentDetails.selectClass;
        CommonUtils.selectDropDownValue(classDropDown, 1);
        BulkDeletePage.selectSearchButton.click();
        BulkDeletePage.searchAdmissisonNumber.sendKeys("2501");
        BulkDeletePage.checkBoxToDelete.click();
        BulkDeletePage.deleteButton.click();
        WebDriverUtils.driver.switchTo().alert().accept();
        CommonUtils.sleep(2000);
    }

    /**
     * Use this method to disable a student
     * 
     * 
     */
    public void disablingStudent() {
        studentDetails.thumbsDown.click();
        CommonUtils.acceptAlert();
        CommonUtils.sleep(2000);
        WebElement reasonDropDown = studentDetails.selectReason;
        CommonUtils.selectDropDownValue(reasonDropDown, 2);
        CommonUtils.sleep(2000);
        studentDetails.saveBtn.click();
    }

    /**
     * Use this method to enable a student
     * 
     * 
     */
    public void enablingStudent() {
        studentDetails.thumbsUp.click();
        CommonUtils.sleep(2000);
        CommonUtils.acceptAlert();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
