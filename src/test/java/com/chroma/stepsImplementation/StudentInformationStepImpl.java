package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class StudentInformationStepImpl extends PageInitializer {
    /**
     * Use this method to assert all modules under Student Information Module
     * 
     * @param expectedStudentDetails
     * @param expectedStudentAdmission
     * @param expectedDisabledStudents
     * @param expectedBulkDelete
     * @param expectedStudentCategories
     * @param expectedstudentHouse
     * @param expectedDisableReason
     */
    public static void studentInformationModulesAreDisplayed(String expectedStudentDetails,
            String expectedStudentAdmission, String expectedDisabledStudents, String expectedBulkDelete,
            String expectedStudentCategories,
            String expectedstudentHouse, String expectedDisableReason) {

        String actualStudentDetails = studentInformationModulesPage.actualStudentDetails.getText();
        CommonUtils.assertEquals(expectedStudentDetails, actualStudentDetails);
        String actualStudentAdmission = studentInformationModulesPage.actualStudentAdmission.getText();
        CommonUtils.assertEquals(expectedStudentAdmission, actualStudentAdmission);
        String actualDisabledStudents = studentInformationModulesPage.actualDisabledStudents.getText();
        CommonUtils.assertEquals(expectedDisabledStudents, actualDisabledStudents);
        String actualBuldDelete = studentInformationModulesPage.actualBuldDelete.getText();
        CommonUtils.assertEquals(expectedBulkDelete, actualBuldDelete);
        String actualStudentCategories = studentInformationModulesPage.actualStudentCategories.getText();
        CommonUtils.assertEquals(expectedStudentCategories, actualStudentCategories);
        String actualStudentHouse = studentInformationModulesPage.actualStudentHouse.getText();
        CommonUtils.assertEquals(expectedstudentHouse, actualStudentHouse);
        String actualDisableReason = studentInformationModulesPage.actualDisableReason.getText();
        CommonUtils.assertEquals(expectedDisableReason, actualDisableReason);

    }

}
