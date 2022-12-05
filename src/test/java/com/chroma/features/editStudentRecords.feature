Feature: As a Chroma Tech faculty user, I should be able to edit student records by searching student detail
  
  @AGO-14 @Regression @Rukshan
  Scenario: CTSMS - Ability to edit student records
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And user is directed to dashboard page and sees "Chroma Tech Academy" text
    And user navigates to Student Information page
    And user navigates to Student Details
    And selects the "SDET" option from the Class drop down menu
    And selects "Database Testing" from the Section drop down menu
    And clicks the Search button
    And user clicks on edit under action
    And edits the Admission Number "0123456" to the text box
    And user clicks on save button 
    Then user is shown confirmation message "Record Update Successfully"

