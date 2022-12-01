package com.chroma.stepDefinitions;

import org.openqa.selenium.By;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/*
 * Avengers group one 
 * CTSMS Student admission 
 */

public class StudentStepDefinitions extends PageInitializer {

    @When("creates a new student")
    public void creates_a_new_student() {
        dashboardPage.studentInformationMenuButton.click();
        WebDriverUtils.driver.findElement(By.xpath("//*[@id='class_id']"));
    }

    @When("user creates admission with an existing number")
    public void user_creates_admission_with_an_existing_number() {
        WebDriverUtils.driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]"));

        
    }

    @Then("user gets an error message requiring unique admission number")
    public void user_gets_an_error_message_requiring_unique_admission_number() {
        


    }

    @When("user navigates to student details")
    public void user_navigates_to_student_details() {

    }

    @When("user selects an option on class and section dropdowns and clicks search")
    public void user_selects_an_option_on_class_and_section_dropdowns_and_clicks_search() {

    }

    @Then("user changes are saved")
    public void user_changes_are_saved() {

    }

    @Then("user is shown confirmation message")
    public void user_is_shown_confirmation_message() {

    }

    @When("user clicks on student name")
    public void user_clicks_on_student_name() {

    }

    @Then("user can be disabled with the disable button")
    public void user_can_be_disabled_with_the_disable_button() {

    }

}
