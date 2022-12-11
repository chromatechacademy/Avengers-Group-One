Feature: Real Estate - Delete a Project AGO50

  @AGO50 @Progression @Zhenya
  Scenario: As an admin user, when I navigate to the “Projects” page, I can add a new project with unique information.
    Once I log out of the application and log in as an agent user, I am able to verify that the new project has been added.
    After verifying the new project has been added, I can log in as an admin user and delete the new project and verify that it has been removed.

    Given an admin user is on the Real Estate login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When user logs in with username and password "admin@mexil.it" "123456"
    And clicks on Projects button
    And clicks on Add New Project button
    And selects "Townhomes" in the Type dropdown
    And user enters "Sky is the limit" in the Developer text box
    And user enters "MrS" in the Title text box
    And user enters "test@email.com" in the Enquiry Only Email text box
    And user enters "newproject.com" in the Websites text box
    And user enters "Joe" in the Sales Request Recipient Name text box
    And user enters "123-456-7890" in the Sales Request Recipient Phone text box
    And user enters "email@email.com" in the Sales Request Recipient Email text box
    And user enters "Joe Arch" in the architect text box
    And user enters "4" in the Levels text box
    And user enters "Kevin Build" in the Builder text box
    And user enters "12/22/2022" in the Completion Date text box
    And user enters "Sample of instructions" in the Instructions text box
    And user enters "Sample of features" in the Features text box
    And user enters "123" in the Reservation number text box
    And user enters "987" in the Street Number text box
    And user enters "Broadway" in the Street Name text box
    And user enters "Buffalo Grove" in the Suburb text box
    And user enters "IL" in the State text box
    And user enters "60001" in the Postal Code text box
    And user enters "USA" in the Country text box
    And user enters "40.7484° N" in the Latitude text box
    And user enters "73.9857° W" in the Longitude text box
