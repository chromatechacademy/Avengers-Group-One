Feature: CTSMS - Valid Credentials Login AGO-1

  @AGO-1 @Regression @Zhenya
  Scenario: Login to CTSMS
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    Then user is directed to dashboard page
