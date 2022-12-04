Feature: Adding multiple students

    @AGO-19  @Yaryna @Progression
    Scenario Outline: Adding multiple students
        Given a user is on the CTSMS login page "https://chroma.mexil.it/site/login"
        When user logs in with username "general@teacher.com" and password "123456"
        And navigates to the Student Information drop down module
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
            | admissionNO | firstName | Class | Section     | Date of Birth | Gender | If Guardian Is | Guardian Name | Guardian Phone |
            | 12345       | Yaryna    | SDET  | API TESTING | 04/25/1989    | Female | Other          | Yaryna        | 34567          |
            | 3456        | Ayla      | SDET  | API TESTING | 03/12/1988    | Female | Other          | Ayla          | 34556          |
            | 5678        | Lily      | SDET  | API TESTING | 02/20/1990    | Female | Other          | Lily          | 76590          |
            | 234456      | Diego     | SDET  | API TESTING | 12/10/1986    | Male   | Other          | Diego         | 56834          |