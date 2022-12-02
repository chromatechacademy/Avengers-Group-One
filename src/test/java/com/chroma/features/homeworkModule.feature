Feature: CTSMS - Homework Module
  Homework module to have: Add homework

  Scenario: AGO-10 CTSMS - Homework Module
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    And navigates to the Homework dropdown module
    Then Add Homework displays
