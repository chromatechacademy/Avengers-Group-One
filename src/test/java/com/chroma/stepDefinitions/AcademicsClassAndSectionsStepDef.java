package com.chroma.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.AcademicsClassAndSectionStepImpl;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AcademicsClassAndSectionsStepDef extends PageInitializer {

    /*
     * After logging in, user sees list of modules on the side.
     * This step is to click on the Academic module dropdown
     */
    @When("user clicks on Academic module")
    public void user_clicks_on_Academic_module() throws InterruptedException {
        AcademicsClassAndSectionStepImpl.clickingAcademicButton();
    }

    /*
     * After clicking the Academics dropdown, user clicks on the Section button
     */
    @When("user clicks on Section when dropdown appears")
    public void user_clicks_on_Section_when_dropdown_appears() {
        AcademicsClassAndSectionStepImpl.clickingSectionsButton();
    }

    /*
     * Once user is on the Section page, user enters Section name and clicks Save
     * button
     */
    @When("user enters the desired Section name {string} and clicks Save")
    public void user_enters_the_desired_Section_name_and_clicks_Save(String sectionName) {
        AcademicsClassAndSectionStepImpl.creatingSections(sectionName);
    }

    /*
     * User then goes back to the Academic module and clicks the Class button
     */
    @When("user clicks on Class under Academic module")
    public void user_clicks_on_Class_under_Academic_module() {
        AcademicsClassAndSectionStepImpl.clickingClassbutton();
    }

    /*
     * Once user is on the Class page, user can enter the Class name and select the
     * Sections in the form of checkboxes
     */
    @When("user enters the name of the Class {string} and user selects the checkboxes of Sections")
    public void user_enters_the_name_of_the_Class_and_user_selects_the_checkboxes_of_Sections(String className) {
        AcademicsClassAndSectionStepImpl.creatingAClass(className);
    }

    /*
     * User then clicks on the Save button so it can be added to the Class List
     */
    @When("user clicks Save button so the new Class can be added to the Class List")
    public void user_clicks_Save_button_so_the_new_Class_can_be_added_to_the_Class_List() {
        AcademicsClassAndSectionStepImpl.saveButtonClickForClass();
        
    }

    /*
     * Checking to see if the newly added Class is in the Class List
     */
    @When("the new created {string} Class should be in the Class List")
    public void the_new_created_Class_should_be_in_the_Class_List(String expectedClassName) {
        AcademicsClassAndSectionStepImpl.isTheNewClassDisplayed();
    }

    /*
     * User can delete the Class
     */
    @When("the user is able to delete the Class")
    public void the_user_is_able_to_delete_the_Class() {
        AcademicsClassAndSectionStepImpl.deletingCreatedClass();
    }

    /*
     * User then can also delete Sections
     */
    @Then("the user can also delete the Section")
    public void the_user_can_also_delete_the_Section() {
        AcademicsClassAndSectionStepImpl.deletingCreatedSections();;
    }

}