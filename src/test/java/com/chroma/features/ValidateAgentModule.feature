Feature: Validate agent module text

  @Progression
  Scenario: Navigating to agents page
    Given an admin user is on the Real Estate login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When user logs in with username "admin@mexil.it" and password "123456"
    Then user is navigated to the agents page

  @AGO-45_Reshad
  Scenario: Creating a new agent
    Given an admin user is on the Real Estate login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When user logs in with username "admin@mexil.it" and password "123456"
    And As an admin user, I am able to add an agent with an unique credentials
    And the agent is added, I am able to verify that the agent is listed as active with the exact credentials
    Then the newly created agents information matches the information that I had created it with
    And I am able to log into the website with the new agents credentials 
