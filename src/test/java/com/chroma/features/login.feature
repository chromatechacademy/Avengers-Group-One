Feature: CTSMS - Login AGO-1/AGO-2

  @AGO1 @Smoke @Zhenya
  Scenario: Login to CTSMS with valid credantials
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    Then user is directed to dashboard page and sees "Chroma Tech Academy" text

  @AGO2 @Smoke @Zhenya
  Scenario: Login to CTSMS with invalid credantials
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "generall@teacher.com" and password "123456"
    Then user sees "Invalid Username or Password" message
