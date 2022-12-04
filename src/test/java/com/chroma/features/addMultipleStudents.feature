Feature: Adding multiple students

    @AGO-19  @Yaryna @Regression
    Scenario Outline: Adding multiple students
        Given a user is on the "https://chroma.mexil.it/site/login" Homepage
        When user logs in with email "general@teacher.com" and password "123456"
        And user is directed to dashboard page and sees "Chroma Tech Academy" text
        And user navigates to Student Information page
        And selects the Student Admission option
        And enters admission NO "<admissionNO>"
        And enters First Name "<firstName>"
        And user selects Class "<class>"
        And selects Section "<section>"
        And selects Gender "<gender>"
        And clicks on Date of Birth "<dateOfBirth>"
        And selects If Guardian Is "<ifGuardianIs>"
        And user enters Guardian Name "<guardianName>"
        And enters Guardian Phone "<guardianPhone>"

        Examples:
            | admissionNO | firstName | class | section          | gender | dateOfBirth | ifGuardianIs | guardianName | guardianPhone |
            | 12345       | Yaryna    | SDET  | Database Testing | Female | 04/25/1989  | Father       | Shomir       | 34567         |
            | 3456        | Ayla      | SDET  | Database Testing | Female | 03/12/1988  | Father       | Shomir       | 34556         |
            | 5678        | Lily      | SDET  | Database Testing | Female | 02/20/1990  | Father       | Shomir       | 76590         |
            | 234456      | Diego     | SDET  | Database Testing | Male   | 12/10/1986  | Father       | Shomir       | 56834         |