package com.chroma.stepsImplementation;

import org.openqa.selenium.support.ui.Select;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.web.CommonUtils;

public class StudentAdmissionStepImpl extends PageInitializer {
    public static void studentAdmission(
            String admissionNumber,
            String rollNumber,
            String classDropDownMenuAdmissionPage,
            String sectionDropDownMenuAdmissionPage,
            String firstName,
            String femaleGenderDropDown,
            String guardianName,
            String guardianPhoneNum
    ) 
    {
        DashboardPage.studentInformationModule.click();
        StudentAdmissionPage.studentAdmissionModule.click();
        StudentAdmissionPage.admissionNumberTextBox.sendKeys(admissionNumber);
        StudentAdmissionPage.rollNumberTextBox.sendKeys(rollNumber);
        CommonUtils.selectDropDownValue(StudentAdmissionPage.classDropDownMenu, classDropDownMenuAdmissionPage);
        CommonUtils.selectDropDownValue(StudentAdmissionPage.sectionDropDownMenu, sectionDropDownMenuAdmissionPage);
        StudentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        CommonUtils.selectDropDownValue(StudentAdmissionPage.genderDropDownMenu, femaleGenderDropDown);
        StudentAdmissionPage.DOBDropDownCalendar.click();
        StudentAdmissionPage.DOBDateSelection.click();
        StudentAdmissionPage.guardianRadioButton.click();
        StudentAdmissionPage.guardianNameTextBox.sendKeys(guardianName);
        StudentAdmissionPage.guardianPhoneTextBox.sendKeys(guardianPhoneNum);
        StudentAdmissionPage.saveButton.click();
        CommonUtils.sleep(2000);

    }

}
