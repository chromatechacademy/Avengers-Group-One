package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class RealEstateProjectsStepImpl extends PageInitializer {
    /**
     * Use this method to assert option under Projects
     * 
     * @param expectedAddNewProject
     * @param expectedProjects
     * @param expectedActive
     * @param expectedArchived
     */
    public static void optionsUnderProjectsButton(String expectedAddNewProject, String expectedProjects,
            String expectedActive, String expectedArchived) {
        String actualAddNewProject = projectsPage.actualAddNewProjectsText.getText();
        CommonUtils.assertEquals(actualAddNewProject, expectedArchived);
        String actualProjects = projectsPage.actualProjectText.getText();
        CommonUtils.assertEquals(actualProjects, expectedArchived);
        String actualActive = projectsPage.actualActiveText.getText();
        CommonUtils.assertEquals(actualActive, expectedArchived);
        String actualArchived = projectsPage.actualArchivedText.getText();
        CommonUtils.assertEquals(actualArchived, expectedArchived);
    }

    /**
     * Use this method to assert tabs in Sold table
     * 
     * @param expectedIdSold
     * @param expectedProjectSold
     * @param expectedPriceSold
     * @param expectedBedsSold
     * @param expectedBathsSold
     * @param expectedCarsSold
     * @param expectedCarLotsSold
     * @param expectedStorageLotsSold
     * @param expectedLevelSold
     * @param expectedAspectSold
     * @param expectedTotalAreaSold
     * @param expectedStatusSold
     * @param expectedSoldBySold
     */
    public static void assertTabsInSoldTable(String expectedIdSold, String expectedProjectSold,
            String expectedPriceSold, String expectedBedsSold, String expectedBathsSold, String expectedCarsSold,
            String expectedCarLotsSold, String expectedStorageLotsSold, String expectedLevelSold,
            String expectedAspectSold, String expectedTotalAreaSold, String expectedStatusSold,
            String expectedSoldBySold) {
        String actualIdSold = realEstateHomePage.actualIdSold.getText();
        CommonUtils.assertEquals(actualIdSold, expectedIdSold);
        String actualProjectSold = realEstateHomePage.actualProjectSold.getText();
        CommonUtils.assertEquals(actualProjectSold, expectedProjectSold);
        String actualPriceSold = realEstateHomePage.actualPriceSold.getText();
        CommonUtils.assertEquals(actualPriceSold, expectedPriceSold);
        String actualBedsSold = realEstateHomePage.actualBedsSold.getText();
        CommonUtils.assertEquals(actualBedsSold, expectedBedsSold);
        String actualBathsSold = realEstateHomePage.actualBathsSold.getText();
        CommonUtils.assertEquals(actualBathsSold, expectedBathsSold);
        String actualCarsSold = realEstateHomePage.actualCarsSold.getText();
        CommonUtils.assertEquals(actualCarsSold, expectedCarsSold);
        String actualCarLotsSold = realEstateHomePage.actualCarLotsSold.getText();
        CommonUtils.assertEquals(actualCarLotsSold, expectedCarLotsSold);
        String actualStorageLotsSold = realEstateHomePage.actualStorageLotsSold.getText();
        CommonUtils.assertEquals(actualStorageLotsSold, expectedStorageLotsSold);
        String actualLevelSold = realEstateHomePage.actualLevelSold.getText();
        CommonUtils.assertEquals(actualLevelSold, expectedLevelSold);
        String actualAspectSold = realEstateHomePage.actualAspectSold.getText();
        CommonUtils.assertEquals(actualAspectSold, expectedAspectSold);
        String actualTotalAreaSold = realEstateHomePage.actualTotalAreaSold.getText();
        CommonUtils.assertEquals(actualTotalAreaSold, expectedTotalAreaSold);
        String actualStatusSold = realEstateHomePage.actualStatusSold.getText();
        CommonUtils.assertEquals(actualStatusSold, expectedStatusSold);
        String actualSoldBySold = realEstateHomePage.actualSoldBySold.getText();
        CommonUtils.assertEquals(actualSoldBySold, expectedSoldBySold);
    }

    /**
     * Use this method to assert tab in Reserved table
     * 
     * @param expectedIdReserved
     * @param expectedProjectReserved
     * @param expectedPriceReserved
     * @param expectedBedsReserved
     * @param expectedBathsReserved
     * @param expectedCarsReserved
     * @param expectedCarLotsReserved
     * @param expectedStorageLotsReserved
     * @param expectedLevelReserved
     * @param expectedAspectReserved
     * @param expectedTotalAreaReserved
     * @param expectedStatusReserved
     * @param expectedReservedByReserved
     */
    public static void assertTabsInReservedTable(String expectedIdReserved, String expectedProjectReserved,
            String expectedPriceReserved, String expectedBedsReserved, String expectedBathsReserved,
            String expectedCarsReserved,
            String expectedCarLotsReserved, String expectedStorageLotsReserved, String expectedLevelReserved,
            String expectedAspectReserved, String expectedTotalAreaReserved, String expectedStatusReserved,
            String expectedReservedByReserved) {
        String actualIdReserved = realEstateHomePage.actualIdReserved.getText();
        CommonUtils.assertEquals(actualIdReserved, expectedIdReserved);
        String actualProjectReserved = realEstateHomePage.actualProjectReserved.getText();
        CommonUtils.assertEquals(actualProjectReserved, expectedProjectReserved);
        String actualPriceReserved = realEstateHomePage.actualPriceReserved.getText();
        CommonUtils.assertEquals(actualPriceReserved, expectedPriceReserved);
        String actualBedsReserved = realEstateHomePage.actualBedsReserved.getText();
        CommonUtils.assertEquals(actualBedsReserved, expectedBedsReserved);
        String actualBathsReserved = realEstateHomePage.actualBathsReserved.getText();
        CommonUtils.assertEquals(actualBathsReserved, expectedBathsReserved);
        String actualCarsReserved = realEstateHomePage.actualCarsReserved.getText();
        CommonUtils.assertEquals(actualCarsReserved, expectedCarsReserved);
        String actualCarLotsReserved = realEstateHomePage.actualCarLotsReserved.getText();
        CommonUtils.assertEquals(actualCarLotsReserved, expectedCarLotsReserved);
        String actualStorageLotsReserved = realEstateHomePage.actualStorageLotsReserved.getText();
        CommonUtils.assertEquals(actualStorageLotsReserved, expectedStorageLotsReserved);
        String actualLevelReserved = realEstateHomePage.actualLevelReserved.getText();
        CommonUtils.assertEquals(actualLevelReserved, expectedLevelReserved);
        String actualAspectReserved = realEstateHomePage.actualAspectReserved.getText();
        CommonUtils.assertEquals(actualAspectReserved, expectedAspectReserved);
        String actualTotalAreaReserved = realEstateHomePage.actualTotalAreaReserved.getText();
        CommonUtils.assertEquals(actualTotalAreaReserved, expectedTotalAreaReserved);
        String actualStatusReserved = realEstateHomePage.actualStatusReserved.getText();
        CommonUtils.assertEquals(actualStatusReserved, expectedStatusReserved);
        String actualReservedByReserved = realEstateHomePage.actualReservedByReserved.getText();
        CommonUtils.assertEquals(actualReservedByReserved, expectedReservedByReserved);
    }
}