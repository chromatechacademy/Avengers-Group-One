Feature: CTSMS mobile login

  @Reshad @AGO-21 @Regression
  Scenario: Login to CTSMS with valid credantials
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    Then user is directed to dashboard page and sees "Chroma Tech Academy" text
