Feature: CTSMS - Human Resource module
  Human Resource module to include the following modules:

Staff Directory
Staff Attendance
Payroll
Approve Leave Request
Apply Leave
Leave Type
Teachers Rating
Department
Designation

  @Ayla @AGO-9 @Smoke
  Scenario: AGO-9 CTSMS-Human Resource Module
    Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
    When user logs in with username "general@teacher.com" and password "123456"
    And navigates to the Human Resources dropdown module
    Then Staff Directory, Staff Attendance, Payroll, Approve Leave Request, Apply Leave, Leave Type, Teachers Rating, Department, Designation,  options will display
