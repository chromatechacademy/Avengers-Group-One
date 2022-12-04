package com.chroma.stepDefinitions;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.IncomeModuleVerificationStepImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncomeModuleVerificationStepDef extends PageInitializer {
    // USER CLICKS ON INCOME MODULE
    @When("user clicks on the Income Module")
    public void user_clicks_on_the_Income_Module() {
        IncomeModuleVerificationStepImpl.clickingOnIncomeModule();
    }

    // ASSERTING THE TEXT UNDER THE INCOME MODULE
    @Then("the following clickable sections appears {string} {string} {string}")
    public void the_following_clickable_sections_appears(String addIncome, String searchIncome, String incomeHead) {
        IncomeModuleVerificationStepImpl.assertingIncomeModule(addIncome, searchIncome, incomeHead);
    }
}
