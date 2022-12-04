package com.chroma.stepsImplementation;

import org.openqa.selenium.WebElement;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class IncomeModuleVerificationStepImpl extends PageInitializer {

    // Clicking on the Income module button
    public static void clickingOnIncomeModule() {
        moduleVerificationPage.incomeModuleButton.click();
        CommonUtils.waitForVisibility(moduleVerificationPage.buttonIncomeHead);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    // Asserts the text of buttons under Income module
    public static void assertingIncomeModule(String addIncome, String searchIncome, String incomeHead) {
        WebElement incomeOne = moduleVerificationPage.buttonAddIncome;
        WebElement incomeTwo = moduleVerificationPage.buttonSearchIncome;
        WebElement incomeThree = moduleVerificationPage.buttonIncomeHead;
        String incomeNameExpectedOne = addIncome;
        String incomeNameExpectedTwo = searchIncome;
        String incomeNameExpectedThree = incomeHead;
        String incomeNameActualOne = incomeOne.getText();
        String incomeNameActualTwo = incomeTwo.getText();
        String incomeNameActualThree = incomeThree.getText();
        CommonUtils.assertEquals(incomeNameExpectedOne, incomeNameActualOne);
        CommonUtils.assertEquals(incomeNameExpectedTwo, incomeNameActualTwo);
        CommonUtils.assertEquals(incomeNameExpectedThree, incomeNameActualThree);
    }
}
