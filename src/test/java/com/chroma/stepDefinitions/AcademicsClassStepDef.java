package com.chroma.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.JavascriptUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AcademicsClassStepDef {

    @When("user clicks on Academic module")
    public void user_clicks_on_Academic_module() throws InterruptedException {
        WebDriverUtils.driver.findElement(By.xpath("//body[1]/div[1]/aside[1]/div[1]/section[1]/ul[2]/li[5]/a[1]"))
                .click();
    }

    @When("user clicks on Section when dropdown appears")
    public void user_clicks_on_Section_when_dropdown_appears() {
        WebDriverUtils.driver.findElement(By.xpath("//a[normalize-space()='Sections']")).click();
    }

    @When("user enters the desired Section name {string} and clicks Save")
    public void user_enters_the_desired_Section_name_and_clicks_Save(String sectionName) {
        WebDriverUtils.driver.findElement(By.xpath("//input[@name='section']")).sendKeys("sectionName");
        WebDriverUtils.driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Save']")).click();
    }

    @When("user clicks on Class under Academic module")
    public void user_clicks_on_Class_under_Academic_module() {
        WebDriverUtils.driver.findElement(By.xpath("//a[normalize-space()='Class']")).click();
    }

    @When("user enters the name of the Class {string} and user selects the checkboxes of Sections")
    public void user_enters_the_name_of_the_Class_and_user_selects_the_checkboxes_of_Sections(String className) {
        WebDriverUtils.driver.findElement(By.xpath("//input[@name='class']")).sendKeys(className);
        List<WebElement> checkboxes = WebDriverUtils.driver.findElements(By.xpath("//input[@type='checkbox']"));
    }

    @When("user clicks Save button so the new Class can be added to the Class List")
    public void user_clicks_Save_button_so_the_new_Class_can_be_added_to_the_Class_List() {
        WebDriverUtils.driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Save']")).click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("the new created Class should be in the Class List")
    public void the_new_created_Class_should_be_in_the_Class_List() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the user is able to delete the Class")
    public void the_user_is_able_to_delete_the_Class() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the user can also delete the Section")
    public void the_user_can_also_delete_the_Section() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
