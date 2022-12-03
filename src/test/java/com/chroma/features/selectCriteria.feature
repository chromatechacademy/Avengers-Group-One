Feature: CTSMS - Student Admissions
As an admin/faculty user, I should not be able to admit a student with an already existing admission number. 

  @AGO-13 @Rukshan
  Scenario: CTSMS - Student unique admission number
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And user is directed to dashboard page and sees "Chroma Tech Academy" text
    And user navigates to Student Information page
    And navigates to Select Criteria page
    And clicks on dropdowns Class and selects "SDET" 
    And clicks on dropdown Section and selects "Database Testing"
    And clicks on search button
    And user selects an existing number
    And user creates admission with an existing number
    Then user gets an error message requiring unique admission number

