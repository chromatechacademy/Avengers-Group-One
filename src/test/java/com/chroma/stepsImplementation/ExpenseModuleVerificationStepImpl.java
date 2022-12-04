package com.chroma.stepsImplementation;

import org.openqa.selenium.WebElement;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class ExpenseModuleVerificationStepImpl extends PageInitializer {

    // Clicking on the Expense Module button
    public static void clickingOnExpenseModule() {
        moduleVerificationPage.expenseModuleButton.click();
        CommonUtils.waitForVisibility(moduleVerificationPage.buttonExpenseHead);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    // Asserts the text of buttons under Expense module
    public static void assertingExpenseModule(String addExpense, String searchExpense, String expenseHead) {
        WebElement expenseOne = moduleVerificationPage.buttonAddExpense;
        WebElement expenseTwo = moduleVerificationPage.buttonSearchExpense;
        WebElement expenseThree = moduleVerificationPage.buttonExpenseHead;
        String expenseNameExpectedOne = addExpense;
        String expenseNameExpectedTwo = searchExpense;
        String expenseNameExpectedThree = expenseHead;
        String expenseNameActualOne = expenseOne.getText();
        String expenseNameActualTwo = expenseTwo.getText();
        String expenseNameActualThree = expenseThree.getText();
        CommonUtils.assertEquals(expenseNameExpectedOne, expenseNameActualOne);
        CommonUtils.assertEquals(expenseNameExpectedTwo, expenseNameActualTwo);
        CommonUtils.assertEquals(expenseNameExpectedThree, expenseNameActualThree);
    }
}
