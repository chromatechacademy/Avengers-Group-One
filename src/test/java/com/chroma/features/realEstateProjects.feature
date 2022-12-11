Feature: Real Estate - Validate Projects Module Text

  @AGO48 @Progression @Zhenya
  Scenario: As an admin user, when I navigate to the “Projects” page, then I am able to view the following text:
Add New Project
Projects
Active
Archived

    Given an admin user is on the Real Estate login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When user logs in with username and password "admin@mexil.it" "123456"
    And clicks on Projects button
    Then user sees following text "Add New Project","Projects","Active","Archived"
