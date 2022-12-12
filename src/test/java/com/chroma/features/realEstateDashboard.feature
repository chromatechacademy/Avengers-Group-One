Feature: Validate Dashboard Graph Text AGO-43
          Real Estate - Validate Sold By and Reserved By Modules AGO-51

  @AGO43 @Progression @Zhenya
  Scenario: As an admin user, when I navigate to the dashboard and click “Agents Graph”, then
            the graph displays with header text “Reserved by Agents”. Then when I click “Overview”, then 
            the graph displays with the header text “Properties Overview”.

    Given an admin user is on the Real Estate login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When user logs in with username and password "admin@mexil.it" "123456"
    And user navigates to "Agents Graph" on the Dashboard
    And the graph displays with header text "Reserved by Agents"
    And user navigates to "Overview" on the Dashboard
    Then the graph displays with header text "Properties Overview"

  @AGO51 @Regression @Zhenya
  Scenario: As an agent user, when I navigate to the dashboard and click the “Sold By Me”
  and “Reserved By Me” fields/tabs, then a pop-up displays for both sections with the text:
    PROJECT
    PRICE
    BEDS
    BATHS
    CARS
    CAR LOTS
    STORAGE LOTS
    LEVEL
    ASPECT
    TOTAL AREA
    STATUS
    SOLD BY

    Given an admin user is on the Real Estate login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When user logs in with username and password "admin@mexil.it" "123456"
    And Clicks on Sold
    And confirms header has tabs:"ID","PROJECT","PRICE","BEDS","BATHS","CARS","CAR LOTS","STORAGE LOTS","LEVEL","ASPECT","TOTAL AREA","STATUS","SOLD BY" under SOLD
    And closes this table
    And clicks on Reserved
    Then confirms header has tabs:"ID","PROJECT","PRICE","BEDS","BATHS","CARS","CAR LOTS","STORAGE LOTS","LEVEL","ASPECT","TOTAL AREA","STATUS","SOLD BY" under RESERVED
