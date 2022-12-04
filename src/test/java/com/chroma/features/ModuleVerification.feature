Feature: Verifying the different Module dropdown has the required fields to click

  @Regression @james @AGO-6
  Scenario: Verify that the Income Module includes modules named Add Income, Search Income & Income Head
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And user clicks on the Income Module
    Then the following clickable sections appears "Add Income" "Search Income" "Income Head"

  @Regression @james @AGO-7
  Scenario: Verify that the Income Module includes modules named Add Income, Search Income & Income Head
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And user clicks on the Expense Module
    Then the following sections appears "Add Expense" "Search Expense" "Expense Head"

  @Regression @james @AGO-8
  Scenario: Verify that the Income Module includes modules named Add Income, Search Income & Income Head
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And user clicks on the Academics Module
    Then the following sections appears "Class Timetable", "Teachers Timetable", "Assign Class Teacher", "Promote Students", "Subject Group", "Subjects", "Class", "Sections"
