Feature: CTSMS - Student Admissions

  @AGO-13 @Progression
  Scenario: CTSMS - Student unique admission number
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And navigates to select criteria page

