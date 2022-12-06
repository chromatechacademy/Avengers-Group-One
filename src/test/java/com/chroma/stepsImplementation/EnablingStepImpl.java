package com.chroma.stepsImplementation;

import org.openqa.selenium.WebElement;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.BulkDeletePage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class EnablingStepImpl extends PageInitializer {

    /**
     * Use this method to create new student
     * 
     * 
     */
    public void admittingStudent(String classDropDownMenuAdmissionPage,  String sectionDropDownMenuAdmissionPage) {
        studentAdmissionPage.admissionNumberTextBox.sendKeys("3501");
        studentAdmissionPage.firstNameTextBox.sendKeys("Yaryna");
        CommonUtils.selectDropDownValue(classDropDownMenuAdmissionPage, studentAdmissionPage.classDropDownMenu);
        CommonUtils.selectDropDownValue(sectionDropDownMenuAdmissionPage, studentAdmissionPage.sectionDropDownMenu);
        WebElement genderDropDown = studentAdmissionPage.genderDropDownMenu;
        CommonUtils.selectDropDownValue(genderDropDown, 2);
        studentAdmissionPage.DOBDropDownCalendar.click();
        studentAdmissionPage.DOBDateSelection.click();
        CommonUtils.sleep(3000);
        studentAdmissionPage.guardianRadioButton.click();
        studentAdmissionPage.guardianNameTextBox.sendKeys("Luka");
        studentAdmissionPage.guardianPhoneTextBox.sendKeys("676954");
        studentAdmissionPage.saveButton.click();
        CommonUtils.sleep(2000);
    }

    /**
     * Use this method to student details
     * 
     * 
     */
    public void studentDetails(String classDropDownMenuAdmissionPage) {
        studentDetails.stDetails.click();
        CommonUtils.selectDropDownValue(classDropDownMenuAdmissionPage, studentAdmissionPage.classDropDownMenu);
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
    public void deleteStudent(String classDropDownMenuAdmissionPage) {
        BulkDeletePage.bulkDeleteModule.click();
        CommonUtils.selectDropDownValue(classDropDownMenuAdmissionPage, studentAdmissionPage.classDropDownMenu);
        BulkDeletePage.selectSearchButton.click();
        BulkDeletePage.searchAdmissisonNumber.sendKeys("3501");
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

     /**
     * Use this method to for sections and class 
     * 
     * 
     */
    public void sectionclass(String classDropDownMenuAdmissionPage, String sectionDropDownMenuAdmissionPage ) {
        studentDetails.stDetails.click();
        CommonUtils.selectDropDownValue(studentAdmissionPage.classDropDownMenu, classDropDownMenuAdmissionPage);
        CommonUtils.selectDropDownValue(studentAdmissionPage.sectionDropDownMenu, sectionDropDownMenuAdmissionPage);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        studentDetails.searchButton.click();
        studentDetails.student.click();
        CommonUtils.sleep(2000);
    }
}
