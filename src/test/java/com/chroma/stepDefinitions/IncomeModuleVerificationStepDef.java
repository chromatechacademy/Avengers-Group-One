package com.chroma.stepDefinitions;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncomeModuleVerificationStepDef extends PageInitializer {

    @When("user clicks on the Income Module")
    public void user_clicks_on_the_Income_Module() {
        WebDriverUtils.driver.findElement(By.xpath("//body/div/aside/div/section/ul/li[3]/a[1]")).click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("the following clickable sections appears {string} {string} {string}")
    public void the_following_clickable_sections_appears(String addIncome, String searchIncome, String incomeHead) {
        WebElement IncomeOne = driver
                .findElement(By.xpath("(//a[contains(text(),'Income')]//parent::li/descendant::a)[1]"));
        WebElement IncomeTwo = driver
                .findElement(By.xpath("(//a[contains(text(),'Income')]//parent::li/descendant::a)[2]"));
        WebElement IncomeThree = driver
                .findElement(By.xpath("(//a[contains(text(),'Income')]//parent::li/descendant::a)[3]"));

        String incomeNameExpectedOne = addIncome;
        String incomeNameExpectedTwo = searchIncome;
        String incomeNameExpectedThree = incomeHead;

        String incomeNameActualArrayOne = IncomeOne.getText();
        String incomeNameActualArrayTwo = IncomeTwo.getText();
        String incomeNameActualArrayThree = IncomeThree.getText();

        Assert.assertEquals(incomeNameExpectedOne, incomeNameActualArrayOne);
        Assert.assertEquals(incomeNameExpectedTwo, incomeNameActualArrayTwo);
        Assert.assertEquals(incomeNameExpectedThree, incomeNameActualArrayThree);
    }
}
