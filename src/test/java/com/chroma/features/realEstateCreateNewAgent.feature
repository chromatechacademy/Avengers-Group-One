Feature: Real Estate - Create a New Agent AGO-45

  @AGO45 @Regression @Zhenya
  Scenario: As an admin user, I am able to add an agent with a unique name, mail (email), and contact number.
Once the agent is added, I am able to verify that the agent is listed as active with the exact name, mail (email), 
and contact number that I had originally added.After the newly created agent's information matches the information 
that I had created it with, I am able to log into the website with the new agent's credentials (email & password).

    Given an admin user is on the Real Estate login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When user logs in with username and password "admin@mexil.it" "123456"
    And verifies a unique agent has been added wih "Agent", "Lead", "123-456-7890", "test1@email.com", "passWord"
    And an admin user is on the Real Estate login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/login.php"
    And user logs in with username and password "test1@email.com" "passWord"
    And clicks on my account icon
    And clicks on My profile
    Then confirms user is loged in with new email "test1@email.com"
