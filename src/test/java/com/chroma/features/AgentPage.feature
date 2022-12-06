Feature: Agent page features
  @AGO-45 @Reshad @Regression
  Scenario: Creating a new agent
    Given an admin user is on the Real Estate login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When user logs in with username and password "admin@mexil.it" "123456"
    And verifies a unique agent has been added wih "Ishaq", "chy", "7339992341", "Ishaqsdh@email.com", "passWord"
    
  @AGO-44 @Reshad  @Regression 
  Scenario: Validate agent module text
     Given an admin user is on the Real Estate login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When user logs in with username and password "admin@mexil.it" "123456"
    Then user is navigated to the agents page
    And the following text displays "Active", "Inactive", "All Agents", "NAME", "MAIL", "CONTACT NUMBER", "ACTIONS", "Add Now"

   
