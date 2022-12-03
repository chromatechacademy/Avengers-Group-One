package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.web.CommonUtils;

public class StudentAdmissionStepImpl extends PageInitializer {
    public static void studentAdmission(String admissionNumber, String rollNumber,
            String classDropDownMenuAdmissionPage, String sectionDropDownMenuAdmissionPage, String firstName,
            String femaleGenderDropDown, String guardianName, String guardianPhoneNum) {
        DashboardPage.studentInformationModule.click();
        studentAdmissionPage.studentAdmissionModule.click();
        studentAdmissionPage.admissionNumberTextBox.sendKeys(admissionNumber);
        studentAdmissionPage.rollNumberTextBox.sendKeys(rollNumber);
        CommonUtils.selectDropDownValue(studentAdmissionPage.classDropDownMenu, classDropDownMenuAdmissionPage);
        CommonUtils.selectDropDownValue(studentAdmissionPage.sectionDropDownMenu, sectionDropDownMenuAdmissionPage);
        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        CommonUtils.selectDropDownValue(studentAdmissionPage.genderDropDownMenu, femaleGenderDropDown);
        studentAdmissionPage.DOBDropDownCalendar.click();
        studentAdmissionPage.DOBDateSelection.click();
        studentAdmissionPage.guardianRadioButton.click();
        studentAdmissionPage.guardianNameTextBox.sendKeys(guardianName);
        studentAdmissionPage.guardianPhoneTextBox.sendKeys(guardianPhoneNum);
        studentAdmissionPage.saveButton.click();
        CommonUtils.sleep(2000);
    }

}
