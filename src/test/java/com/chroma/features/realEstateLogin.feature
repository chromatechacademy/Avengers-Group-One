Feature: Real Estate - Agent Login with Valid Credentials

  @Ayla @AGO41 @Regression
  Scenario: AGO-41 Real Estate - Agent Login with Valid Credentials
    Given a user is on the Chroma Tech Academy Real Estate Login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When user logs in with the valid credentials email "admin@mexil.it" and password "123456"
    Then "Hello, Admin" header displays
