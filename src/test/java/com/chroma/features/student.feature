Feature: CTSMS - Student Admissions

  @AGO-13 @Rukshan @Progression
  Scenario: CTSMS - Student unique admission number
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And user is directed to dashboard page
    And creates a new student
    #And user creates admission with an existing number
    #Then user gets an error message requiring unique admission number
    
  
  @AGO-14 @Rukshan 
  Scenario: ability to edit students
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And user is directed to dashboard page
    And user navigates to student details
    And user selects an option on class and section dropdowns and clicks search
    And user clicks on edit under action
    And user makes and saves changes
    Then user changes are saved
    And user is shown confirmation message 

  @AGO-15 @Rukshan 
  Scenario: ability to disable student records
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And user is directed to dashboard page
    And user navigates to student details
    And user selects an option on class and section dropdowns and clicks search
    And user clicks on student name 
    Then user can be disabled with the disable button
    