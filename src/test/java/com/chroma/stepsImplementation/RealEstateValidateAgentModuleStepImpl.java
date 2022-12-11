package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class RealEstateValidateAgentModuleStepImpl extends PageInitializer {

    /**
     * Use this method to assert text elements on the Agents module page
     * 
     * @param expectedMembersListTextElement
     * @param expectedActiveTextElement
     * @param expectedInactiveTextElement
     * @param expectedAllAgentsTextElement
     * @param expectedAddNowTextElement
     * @param expectedNameTextElement
     * @param expectedMailTextElement
     * @param expectedContactNumberTextElement
     * @param expectedActionsTextElement
     */

    public static void realEstateAgentModuleAssert(String expectedMembersListTextElement,
            String expectedActiveTextElement, String expectedInactiveTextElement, String expectedAllAgentsTextElement,
            String expectedAddNowTextElement, String expectedNameTextElement, String expectedMailTextElement,
            String expectedContactNumberTextElement, String expectedActionsTextElement) {

        String actualMembersListTextElement = realEstateAgentModulePage.actualMembersListTextElement.getText();
        CommonUtils.assertEquals(actualMembersListTextElement, expectedMembersListTextElement);
    
        String actualActiveTextElement = realEstateAgentModulePage.actualActiveTextElement.getText();
        CommonUtils.assertEquals(actualActiveTextElement, expectedActiveTextElement);

        String actualInactiveTextElement = realEstateAgentModulePage.actualInactiveTextElement.getText();
        CommonUtils.assertEquals(actualInactiveTextElement, expectedInactiveTextElement);

        String actualAllAgentsTextElement = realEstateAgentModulePage.actualAllAgentsTextElement.getText();
        CommonUtils.assertEquals(actualAllAgentsTextElement, expectedAllAgentsTextElement);

        String actualAddNowTextElement = realEstateAgentModulePage.actualAddNowTextElement.getText();
        CommonUtils.assertEquals(actualAddNowTextElement, expectedAddNowTextElement);

        String actualNameTextElement = realEstateAgentModulePage.actualNameTextElement.getText();
        CommonUtils.assertEquals(actualNameTextElement, expectedNameTextElement);

        String actualMailTextElement = realEstateAgentModulePage.actualMailTextElement.getText();
        CommonUtils.assertEquals(actualMailTextElement, expectedMailTextElement);

        String actualContactNumberTextElement = realEstateAgentModulePage.actualContactNumberTextElement.getText();
        CommonUtils.assertEquals(actualContactNumberTextElement, expectedContactNumberTextElement);

        String actualActionsTextElement = realEstateAgentModulePage.actualActionsTextElement.getText();
        CommonUtils.assertEquals(actualActionsTextElement, expectedActionsTextElement);

    }

}
