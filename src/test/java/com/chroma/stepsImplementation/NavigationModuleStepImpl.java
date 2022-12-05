package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class NavigationModuleStepImpl extends PageInitializer {
    /**
     * Use this method to assert navigation module
     * 
     * @param expectedStudentInformationModule
     * @param expectedFeesCollection
     * @param expectedIncome
     * @param expectedExpences
     * @param expectedAcademics
     * @param expectedHumanResource
     * @param expectedHomework
     * @param exectedReports
     */
    public static void navigationModulesAreDisplayed(String expectedStudentInformationModule,
            String expectedFeesCollection,
            String expectedIncome, String expectedExpences, String expectedAcademics, String expectedHumanResource,
            String expectedHomework, String exectedReports) {

        String actualStudentInformationModule = navigationModulesPage.actualStudentInformation.getText();
        CommonUtils.assertEquals(expectedStudentInformationModule, actualStudentInformationModule);
        String actualFeesCollection = navigationModulesPage.actualFeesCollection.getText();
        CommonUtils.assertEquals(expectedFeesCollection, actualFeesCollection);
        String actualIncome = navigationModulesPage.actualIncome.getText();
        CommonUtils.assertEquals(expectedIncome, actualIncome);
        String actualExpences = navigationModulesPage.actualExpences.getText();
        CommonUtils.assertEquals(expectedExpences, actualExpences);
        String actualAcademics = navigationModulesPage.actualAcademics.getText();
        CommonUtils.assertEquals(expectedAcademics, actualAcademics);
        String actualHumanResource = navigationModulesPage.actualHumanResource.getText();
        CommonUtils.assertEquals(expectedHumanResource, actualHumanResource);
        String actualHomework = navigationModulesPage.actualHomework.getText();
        CommonUtils.assertEquals(expectedHomework, actualHomework);
        String actualReports = navigationModulesPage.actualReports.getText();
        CommonUtils.assertEquals(exectedReports, actualReports);

    }

}
