Feature: Testing Academic Module Dropdowns

  @Progression @AOG-18 @AOG-17 @james
  Scenario: Testing the add and delete function for Classes and Sections
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And user clicks on Academic module
    And user clicks on Section when dropdown appears
    And user enters the desired Section name "Sample Section" and clicks Save
    And user clicks on Class under Academic module
    And user enters the name of the Class "Sample Class" and user selects the checkboxes of Sections
    And user clicks Save button so the new Class can be added to the Class List
    And the new created "Sample Class" Class should be in the Class List
    And the user is able to delete the created class name "Sample Class"
    Then the user can also delete the Section

