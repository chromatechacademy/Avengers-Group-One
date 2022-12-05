Feature: CTSMS - Navigation Module AGO-3

  @AGO3 @Regression @Zhenya
  Scenario: All modules are displayed after successful login 
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    Then user sees Module: "Student Information", "Fees Collection", "Income", "Expenses", "Academics", "Human Resource", "Homework", "Reports"


    

