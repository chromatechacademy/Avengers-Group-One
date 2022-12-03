Feature: Verifying the different Module dropdown has the required fields to click

  @Progression @james @AGO-6
  Scenario: Verify that the Income Module has the clickable fields, Add Income, Search Income & Income Head
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And user clicks on the Income Module
    Then the following clickable sections appears "Add Income" "Search Income" "Income Head"
