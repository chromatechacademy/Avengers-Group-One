package com.chroma.stepDefinitions;

import com.chroma.pages.ModuleVerifcationPage;
import com.chroma.stepsImplementation.ExpenseModuleVerificationStepImpl;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExpenseModuleVerificationStepDef {
    // Clicking on Expense Module
    @When("user clicks on the Expense Module")
    public void user_clicks_on_the_Expense_Module() {
        ExpenseModuleVerificationStepImpl.clickingOnExpenseModule();
    }

    // Asserting the text under Expense Module 
    @Then("the following sections appears {string} {string} {string}")
    public void the_following_sections_appears(String addExpense, String searchExpense, String expenseHead) {
       ExpenseModuleVerificationStepImpl.assertingExpenseModule(addExpense, searchExpense, expenseHead);
    }

}
