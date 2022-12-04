package com.chroma.stepsImplementation;

import static org.junit.Assert.assertArrayEquals;

import org.openqa.selenium.WebElement;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class AcademicsModuleVerificationStepImpl extends PageInitializer {

    // Clicking Academic Module
    public static void clickingOnAcademicModule() {
        moduleVerificationPage.expenseModuleButton.click();
        CommonUtils.waitForVisibility(moduleVerificationPage.buttonSections);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    // Asserting the buttons under Academic Module
    public static void assertingAcademicsModule(String classTimetable, String teachersTimetable,
    String assignClassTeacher, String promoteStudents,
    String subjectGroup, String subjects, String classModule, String sections) {
        WebElement academicNameOne = moduleVerificationPage.buttonClassTimeTable;
        WebElement academicNameTwo = moduleVerificationPage.buttonTeacherTimeTable;
        WebElement academicNameThree = moduleVerificationPage.buttonAssignClassTeacher;
        WebElement academicNameFour = moduleVerificationPage.buttonPromoteStudent;
        WebElement academicNameFive = moduleVerificationPage.buttonSubjectGroup;
        WebElement academicNameSix = moduleVerificationPage.buttonSubjects;
        WebElement academicNameSeven = moduleVerificationPage.buttonClass;
        WebElement academicNameEight = moduleVerificationPage.buttonSections;
        String academicActualOne = academicNameOne.getText();
        String academicActualTwo = academicNameTwo.getText();
        String academicActualThree = academicNameThree.getText();
        String academicActualFour = academicNameFour.getText();
        String academicActualFive = academicNameFive.getText();
        String academicActualSix = academicNameSix.getText();
        String academicActualSeven = academicNameSeven.getText();
        String academicActualEight = academicNameEight.getText();
        String academicExpectedOne = classTimetable;
        String academicExpectedTwo = teachersTimetable;
        String academicExpectedThree = assignClassTeacher;
        String academicExpectedFour = promoteStudents;
        String academicExpectedFive = subjectGroup;
        String academicExpectedSix = subjects;
        String academicExpectedSeven = classModule;
        String academicExpectedEight = sections;
        CommonUtils.assertEquals(academicExpectedOne, academicActualOne);
        CommonUtils.assertEquals(academicExpectedTwo, academicActualTwo);
        CommonUtils.assertEquals(academicExpectedThree, academicActualThree);
        CommonUtils.assertEquals(academicExpectedFour, academicActualFour);
        CommonUtils.assertEquals(academicExpectedFive, academicActualFive);
        CommonUtils.assertEquals(academicExpectedSix, academicActualSix);
        CommonUtils.assertEquals(academicExpectedSeven, academicActualSeven);
        CommonUtils.assertEquals(academicExpectedEight, academicActualEight);
    }

}
