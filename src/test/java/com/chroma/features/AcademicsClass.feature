Feature: Testing Academic Module Dropdowns

  @Progression @AOG-18 @james
  Scenario: Testing the add and delete function for Classes
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and paswword "123456"
    And user clicks on Academic module
    And user clicks on Class when dropdown appears
    And user enters the name of the Class "Sample Class" and user selects the checkboxes of Sections
    And user clicks Save button so the new Class can be added to the Class List

