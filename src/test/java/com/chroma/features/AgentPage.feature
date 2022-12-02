Feature: Agent page features

  @Smoke
  Scenario: Navigating to agents page
    Given an admin user is on the Real Estate login page 
    When user logs in with username and password 
    Then user is navigated to the agents page

  @AGO-45 @Reshad @Regression
  Scenario: Creating a new agent
    Given an admin user is on the Real Estate login page
    When user logs in with username and password
    And verifies a unique agent has been added wih "Ishaq", "chy", "7339992341", "Ishaqs@email.com", "passWord"
    And logs into the agent website with the new agents credentials "Ishaqss@email.com", "passWord"

  @AGO-44 @Reshad @Regression
  Scenario: Validate agent module text
     Given an admin user is on the Real Estate login page
    When user logs in with username and password
    Then user is navigated to the agents page
    And the following text displays "Active", "Inactive", "All Agents", "NAME", "MAIL", "CONTACT NUMBER", "ACTIONS", "Add Now"

   
