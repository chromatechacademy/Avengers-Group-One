Feature: CTSMS - Student Admissions
As an admin/faculty user, I should not be able to admit a student with an already existing admission number. 

  @AGO-13 @Rukshan
  Scenario: CTSMS - Student unique admission number
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And user is directed to dashboard page and sees "Chroma Tech Academy" text
    And user navigates to Student Information page
    And selects the Student Admission option
    And enters "012345" to Admission No text box
    And enters "1234" to Roll Number text box
    And selects "SDET" from the Class drop down menu
    And selects the "Database Testing" option from the Section drop down menu
    And enters "Niha" to the First Name text box
    #And selects from the Gender drop down menu
    #And selects date from the Date of Birth drop down calendar
    #And selects the Mother radio button form the If Guardian Is section
    #And enters "mama" to the Guardian Name text box
    And enters "2341094950" to the Guardian Phone text box
    And clicks the Save button
    Then user gets an error message requiring unique admission number
