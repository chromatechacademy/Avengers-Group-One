Feature: CTSMS - Student Information Module AGO-4

  @AGO4 @Smoke @Zhenya
  Scenario: All modules are displayed under Student Information Module
    Given a user is on the "https://chroma.mexil.it/site/login" Homepage
    When user logs in with email "general@teacher.com" and password "123456"
    And navigates to the Student Information drop down module
    Then user sees modules under Student Information Module : "Student Details", "Student Admission", "Disabled Students", "Bulk Delete", "Student Categories", "Student House", "Disable Reason"
