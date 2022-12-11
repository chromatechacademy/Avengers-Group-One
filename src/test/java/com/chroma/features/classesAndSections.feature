Feature: Classes and Section Scenarios

  @AGO-11 @Rukshan @Progression
  Scenario: CTSMS - Class and Sections
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And navigates to Academics module
    And navigates to Class module
    And adds class "Rukshan Class" to Sample class Section
    And verifies message "Record Saved Successfully"
    And verifies class "Rukshan Class" was added
    Then deletes class to rerun automated test case

  # @AGO11 @Zhenya @Progression
  # Scenario Outline: CTSMS - Class and Sections
  #   Given a user is on the "https://chroma.mexil.it/site/login" Homepage
  #   When user logs in with email "general@teacher.com" and password "123456"
  #   And navigates to Academics module
  #   And navigates to Class module
  #   And user sees classes "<classes>"
  #   Then user sees sections "<sections>"

  #   Examples: 
  #     | classes        | sections                            |
  #     | SDET           | Testing Fundamentals                |
  #     | SDET           | SDLC Methodologies                  |
  #     | SDET           | Selenium Test Automation            |
  #     | SDET           | Cucumber Fundamentals               |
  #     | SDET           | API Testing                         |
  #     | SDET           | Git/GitHub                          |
  #     | SDET           | Java 11 for Cool People             |
  #     | SDET           | Mobile Test Automation              |
  #     | SDET           | Accessibility Testing               |
  #     | SDET           | Database Testing                    |
  #     | Cyber Security | Networking Fundamentals             |
  #     | SDET           | Linux Fundamentals                  |
  #     | SDET           | CIA Triad                           |
  #     | SDET           | Penetration Testing/Ethical Hacking |

  @AGO11 @Zhenya @Progression
  Scenario: CTSMS - Class and Sections
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And navigates to Academics module
    And navigates to Class module
    And user sees classes "SDET" and "Cyber Security"
    Then user sees sections "Testing Fundamentals","SDLC Methodologies","Selenium Test Automation","Cucumber Fundamentals","API Testing","Git/GitHub","Java 11 for Cool People","Mobile Test Automation","Accessibility Testing","Database Testing","Networking Fundamentals","Linux Fundamentals","CIA Triad","Penetration Testing/Ethical Hacking"