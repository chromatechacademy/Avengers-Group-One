
Feature: CTSMS - Human Resource module
Fees Collection module to contain the following modules:

Collect Fees
Search Fees Payment
Search Due Fees
Fees Master
Fees Group
Fees Type
Fees Discount
Fees Carry Forward
Fees Reminder

@Ayla @AGO5 @Regression
  Scenario: AGO-9 CTSMS-Human Resource Module
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    And navigates to the Fees Collection dropdown module
    Then modules "Collect Fees", "Search Fees Payment", "Search Due Fees", "Fees Master", "Fees Group", "Fees Type", "Fees Discount", "Fees Carry Forward", "Fees Reminder" display in the drop down
    


