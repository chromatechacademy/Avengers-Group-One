package com.chroma.stepDefinitions;

import org.openqa.selenium.WebElement;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.AcademicsClassAndSectionStepImpl;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AcademicsClassAndSectionsStepDef extends PageInitializer {
    // After logging in, click on Academic module dropdown on the left side
    @When("user clicks on Academic module while on the Dashboard page")
    public void user_clicks_on_Academic_module_while_on_the_Dashboard_page() {
        AcademicsClassAndSectionStepImpl.clickingAcademicButton();
    }

    // After clicking on Academic dropdown, click Section button
    @When("user clicks on Section when dropdown appears")
    public void user_clicks_on_Section_when_dropdown_appears() {
        AcademicsClassAndSectionStepImpl.clickingSectionsButton();
    }

    // Input the desired Section Name and click Save
    @When("user enters the desired Section name {string} and clicks Save")
    public void user_enters_the_desired_Section_name_and_clicks_Save(String sectionName) {
        AcademicsClassAndSectionStepImpl.creatingSections(sectionName);
    }

    // Go back to the Academic dropdown and click Class button
    @When("user clicks on Class under Academic module")
    public void user_clicks_on_Class_under_Academic_module() {
        AcademicsClassAndSectionStepImpl.clickingClassbutton();
    }

    // Input the Class name and select the Sections to be registered with the Class
    @When("user enters the name of the Class {string} and user selects the checkboxes of Sections")
    public void user_enters_the_name_of_the_Class_and_user_selects_the_checkboxes_of_Sections(String className) {
        AcademicsClassAndSectionStepImpl.creatingAClass(className);
    }

    // Click the save button after inputting class name and selecting Section
    @When("user clicks Save button so the new Class can be added to the Class List")
    public void user_clicks_Save_button_so_the_new_Class_can_be_added_to_the_Class_List() {
        AcademicsClassAndSectionStepImpl.saveButtonClickForClass();
    }

    // Asserting if new class was created
    @When("the new created {string} Class should be in the Class List")
    public void the_new_created_Class_should_be_in_the_Class_List(String expectedClassName) {
        AcademicsClassAndSectionStepImpl.isTheNewClassDisplayed(expectedClassName);
    }

    // Deleting the Class made
    @When("the user is able to delete the created class name {string}")
    public void the_user_is_able_to_delete_the_created_class_name(String deletedClass) {
        AcademicsClassAndSectionStepImpl.deletingCreatedClass(deletedClass);
    }

    // Deleting the Section made
    @Then("the user can also delete the Section")
    public void the_user_can_also_delete_the_Section() {
        AcademicsClassAndSectionStepImpl.deletingCreatedSections();
    }

    /* UPDATE */
    // @When("user sees classes {string}")
    // public void user_sees_classes(String expectedClasses) {
    // AcademicsClassAndSectionStepImpl.classListAssert(expectedClasses);
    // }

    // @Then("user sees sections {string}")
    // public void user_sees_sections(String expectedSections) {
    // AcademicsClassAndSectionStepImpl.sectionListAssert(expectedSections);
    // }

    @When("user sees classes {string} and {string}")
    public void user_sees_classes_and(String expectedClassOne, String expectedClassTwo) {
        AcademicsClassAndSectionStepImpl.classListAssert(expectedClassOne, expectedClassTwo);
    }

    @Then("user sees sections {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void user_sees_sections(String expectedSectionOne, String expectedSectionTwo, String expectedSectionThree,
            String expectedSectionFour, String expectedSectionFive, String expectedSectionSix,
            String expectedSectionSeven, String expectedSectionEight, String expectedSectionNine,
            String expectedSectionTen, String expectedSectionEleven, String expectedSectionTwelve,
            String expectedSectionThirteen, String expectedSectionFourteen) {
        AcademicsClassAndSectionStepImpl.sectionListAssert(expectedSectionOne, expectedSectionTwo, expectedSectionThree,
                expectedSectionFour, expectedSectionFive, expectedSectionSix, expectedSectionSeven,
                expectedSectionEight, expectedSectionNine, expectedSectionTen, expectedSectionEleven,
                expectedSectionTwelve, expectedSectionThirteen, expectedSectionFourteen);
    }
}
