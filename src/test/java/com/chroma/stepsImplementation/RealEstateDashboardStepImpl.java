package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class RealEstateDashboardStepImpl extends PageInitializer {

    /**
     * Use this method to assert text elements on the real estate dashboard page
     * 
     * @param expectedDashboardTextElement
     * @param expectedHelloAdminTextElement
     * @param expectedOverviewTextElement
     * @param expectedAgentsGraphTextElement
     * @param expectedPropertiesOverviewTextElement
     * @param expectedPropertiesTextElement
     */
    public static void realEstateDashboardTextElementAssert(String expectedDashboardTextElement,
            String expectedHelloAdminTextElement, String expectedOverviewTextElement,
            String expectedAgentsGraphTextElement, String expectedPropertiesOverviewTextElement,
            String expectedPropertiesTextElement) {

        String actualDashboardTextElement = realEstateDashboardPage.actualDashboardTextElement.getText();
        CommonUtils.assertEquals(actualDashboardTextElement, expectedDashboardTextElement);

        String actualHelloAdminTextElement = realEstateDashboardPage.actualHelloAdminTextElement.getText();
        CommonUtils.assertEquals(actualHelloAdminTextElement, expectedHelloAdminTextElement);

        String actualOverviewTextElement = realEstateDashboardPage.actualOverviewTextElement.getText();
        CommonUtils.assertEquals(actualOverviewTextElement, expectedOverviewTextElement);

        String actualAgentsGraphTextElement = realEstateDashboardPage.actualAgentsGraphTextElement.getText();
        CommonUtils.assertEquals(actualAgentsGraphTextElement, expectedAgentsGraphTextElement);

        String actualPropertiesOverviewTextElement = realEstateDashboardPage.actualPropertiesOverviewTextElement
                .getText();
        CommonUtils.assertEquals(actualPropertiesOverviewTextElement, expectedPropertiesOverviewTextElement);

        String actualPropertiesTextElement = realEstateDashboardPage.actualPropertiesTextElement.getText();
        CommonUtils.assertEquals(actualPropertiesTextElement, expectedPropertiesTextElement);

    }

    /**
     * Use this method to assert tabs on the real estate dashboard page
     * 
     * @param expectedAgentsTabButton
     * @param expectedDashboardTabButton
     */
    public static void realEstateDashboardTabAssert(String expectedAgentsTabButton, String expectedDashboardTabButton) {

        String actualAgentsTabButton = realEstateDashboardPage.actualAgentsTabButton.getText();
        CommonUtils.assertEquals(actualAgentsTabButton, expectedAgentsTabButton);

        String actualDashboardTabButton = realEstateDashboardPage.actualDashboardTabButton.getText();
        CommonUtils.assertEquals(actualDashboardTabButton, expectedDashboardTabButton);

    }

}
