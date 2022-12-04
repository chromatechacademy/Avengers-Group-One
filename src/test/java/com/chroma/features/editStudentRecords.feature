Feature: As a Chroma Tech faculty user, I should be able to edit student records by searching student detail
  
  @AGO-14 @Rukshan
  Scenario: CTSMS - Ability to edit student records
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And user is directed to dashboard page and sees "Chroma Tech Academy" text
    And user navigates to Student Information page
    And user navigates to Student Details
    And user selects an option on class and section dropdowns and clicks search
    And user clicks on edit under action
    And user enters 0123456 to Admission No text box
    Then user changes are saved
    And user is shown confirmation message "Record Update Successfully"

