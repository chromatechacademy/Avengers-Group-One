Feature: CTSMS - Student Admission
As a Chroma Tech Academy faculty member, I want to be able to admit a student via the Student Admission module.

@ayla @AGO12 @Progression
  Scenario: AGO-12 CTSMS-Student Admission
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    And navigates to the Student Information drop down module
    And selects the Student Admission option
    And enters "321" to Admission No text box 
    And enters "44411" to Roll Number text box 
    And selects "SDET" from the Class drop down menu
    And selects the "Database Testing" option from the Section drop down menu 
    And enters "Chroma" to the First Name text box 
    ##And enters "Tech" to the Last Name text box 
    And selects "Female" from the Gender drop down menu
    And selects date from the Date of Birth drop down calendar
    ##And finishes other non-mandatory fields between
    And selects the Father radio button form the If Guardian Is section
    And enters "Chroma Tech Senior" to the Guardian Name text box
    And enters "224-279-6543" to the Guardian Phone text box
    And clicks the Save button 
    ##Then student is admitted and "Record Saved Successfully" is displayed
    And selects Bulk Delete from the Student Information module
    And selects the "SDET" option from the Class drop down menu
    And selects "Database Testing" from the Section drop down menu
    And clicks the Search button
    And enters the Admission Number "321" to the search text box
    And selects the check box for the desired student
    And clicks the Delete button
    Then clicks the OK button in the pop up window


















   
########################################################################
   
    ##And selects the Save button
   
    ##Then a student can be admitted via the student admission module