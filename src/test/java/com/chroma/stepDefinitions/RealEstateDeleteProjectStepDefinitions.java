package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.When;

public class RealEstateDeleteProjectStepDefinitions extends PageInitializer {
    @When("clicks on Add New Project button")
    public void clicks_on_Add_New_Project_button() {
        projectsPage.actualAddNewProjectsText.click();
    }

    @When("selects {string} in the Type dropdown")
    public void selects_in_the_Type_dropdown(String type) {
        CommonUtils.selectDropDownValue(type, newProjectPage.type);
    }

    @When("user enters {string} in the Developer text box")
    public void user_enters_in_the_Developer_text_box(String developer) {
        newProjectPage.developer.sendKeys(developer);
    }

    @When("user enters {string} in the Title text box")
    public void user_enters_in_the_Title_text_box(String title) {
        newProjectPage.title.sendKeys(title);
    }

    @When("user enters {string} in the Enquiry Only Email text box")
    public void user_enters_in_the_Enquiry_Only_Email_text_box(String email) {
        newProjectPage.email.sendKeys(email);
    }

    @When("user enters {string} in the Websites text box")
    public void user_enters_in_the_Websites_text_box(String website) {
        newProjectPage.websites.sendKeys(website);
    }

    @When("user enters {string} in the Sales Request Recipient Name text box")
    public void user_enters_in_the_Sales_Request_Recipient_Name_text_box(String salesRequwstRecipientName) {
        newProjectPage.saleRequestRecipientName.sendKeys(salesRequwstRecipientName);
    }

    @When("user enters {string} in the Sales Request Recipient Phone text box")
    public void user_enters_in_the_Sales_Request_Recipient_Phone_text_box(String salesRequwstRecipientPhone) {
        newProjectPage.saleRequestRecipientPhone.sendKeys(salesRequwstRecipientPhone);
    }

    @When("user enters {string} in the Sales Request Recipient Email text box")
    public void user_enters_in_the_Sales_Request_Recipient_Email_text_box(String salesRequwstRecipientEmail) {
        newProjectPage.saleRequestRecipientEmail.sendKeys(salesRequwstRecipientEmail);
    }

    @When("user enters {string} in the architect text box")
    public void user_enters_in_the_architect_text_box(String architectName) {
        newProjectPage.architect.sendKeys(architectName);
    }

    @When("user enters {string} in the Levels text box")
    public void user_enters_in_the_Levels_text_box(String levelsCount) {
        newProjectPage.levels.sendKeys(levelsCount);
    }

    @When("user enters {string} in the Builder text box")
    public void user_enters_in_the_Builder_text_box(String builderName) {
        newProjectPage.builder.sendKeys(builderName);
    }

    @When("user enters {string} in the Completion Date text box")
    public void user_enters_in_the_Completion_Date_text_box(String completionDate) {
        newProjectPage.completionDate.sendKeys(completionDate);
    }

    @When("user enters {string} in the Instructions text box")
    public void user_enters_in_the_Instructions_text_box(String instructions) {
        newProjectPage.instructions.sendKeys(instructions);
    }

    @When("user enters {string} in the Features text box")
    public void user_enters_in_the_Features_text_box(String featurs) {
        newProjectPage.features.sendKeys(featurs);
    }

    @When("user enters {string} in the Reservation number text box")
    public void user_enters_in_the_Reservation_number_text_box(String reservationNumber) {
        newProjectPage.reservationNumber.sendKeys(reservationNumber);
        CommonUtils.scrollIntoView(newProjectPage.nextButton);
    }

    @When("user enters {string} in the Street Number text box")
    public void user_enters_in_the_Street_Number_text_box(String streetNumber) {
        newProjectPage.streetNumber.sendKeys(streetNumber);
    }

    @When("user enters {string} in the Street Name text box")
    public void user_enters_in_the_Street_Name_text_box(String streetName) {
        newProjectPage.streetName.sendKeys(streetName);
    }

    @When("user enters {string} in the Suburb text box")
    public void user_enters_in_the_Suburb_text_box(String suburb) {
        newProjectPage.suburb.sendKeys(suburb);
    }

    @When("user enters {string} in the State text box")
    public void user_enters_in_the_State_text_box(String state) {
        newProjectPage.state.sendKeys(state);
    }

    @When("user enters {string} in the Postal Code text box")
    public void user_enters_in_the_Postal_Code_text_box(String postalCode) {
        newProjectPage.postalCode.sendKeys(postalCode);
    }

    @When("user enters {string} in the Country text box")
    public void user_enters_in_the_Country_text_box(String country) {
        newProjectPage.country.sendKeys(country);
    }

    @When("user enters {string} in the Latitude text box")
    public void user_enters_in_the_Latitude_text_box(String latitude) {
        newProjectPage.latitude.sendKeys(latitude);
    }

    @When("user enters {string} in the Longitude text box")
    public void user_enters_in_the_Longitude_text_box(String longitude) {
        newProjectPage.longitude.sendKeys(longitude);
    }

    @When("user clicks Next button")
    public void user_clicks_Next_button() {
        newProjectPage.nextButton.click();
    }
}