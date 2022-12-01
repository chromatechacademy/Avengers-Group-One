Feature: Classes and Section Scenarios

    @Progression
  Scenario: CTSMS - Class and Sections
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And navigates to Academics module
    And navigates to Class sub module  
    And adds class "Rukshan Class" to Sample class Section
    And verifies message "Record Saved Successfully"
    And verifies class "Rukshan Class" was added
    Then deletes class to rerun automated test case

