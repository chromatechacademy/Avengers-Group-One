Feature: Cucumber Scenario's Guide
- Description: This feature file 

  @Tech
  Scenario Outline: Sample
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    And user logs in with "<username>" and "<password>"

    Examples: 
      | username            | password |
      | general@teacher.com |   123456 |
      | test@teacher.com    |   123456 |
      | chroma@tech.com     |   123456 |
