Feature: CTSMS - Student Admissions
As an admin/faculty user, I should not be able to admit a student with an already existing admission number. 

  @AGO13 @Rukshan @Regression @Zhenya
  Scenario: CTSMS - Student unique admission number
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    And navigates to the Student Information drop down module
    And selects the Student Admission option
    And enters "321" to Admission No text box
    And enters "44411" to Roll Number text box
    And selects "SDET" from the Class drop down menu
    And selects the "Database Testing" option from the Section drop down menu
    And enters "Chroma" to the First Name text box
    And selects "Female" from the Gender drop down menu
    And selects date from the Date of Birth drop down calendar
    And selects the Father radio button form the If Guardian Is section
    And enters "Chroma Tech Senior" to the Guardian Name text box
    And enters "224-279-6543" to the Guardian Phone text box
    And clicks the Save button
    And enters "321" to Admission No text box
    And enters "44411" to Roll Number text box
    And selects "SDET" from the Class drop down menu
    And selects the "Database Testing" option from the Section drop down menu
    And enters "Chroma" to the First Name text box
    And selects "Female" from the Gender drop down menu
    And selects date from the Date of Birth drop down calendar
    And selects the Father radio button form the If Guardian Is section
    And enters "Chroma Tech Senior" to the Guardian Name text box
    And enters "224-279-6543" to the Guardian Phone text box
    And clicks the Save button
    And error message "The Admission No field must contain a unique value." is displayed
    And selects Bulk Delete from the Student Information module
    And selects the "SDET" option from the Class drop down menu
    And selects "Database Testing" from the Section drop down menu
    And clicks the Search button
    And enters the Admission Number "321" to the search text box
    And selects the check box for the desired student
    And clicks the Delete button
    Then clicks the OK button in the pop up window
