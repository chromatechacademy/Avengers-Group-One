Feature: Adding multiple students


    Scenario Outline: Adding multiple students
        Given a user is on the "https://chroma.mexil.it/site/login" Homepage
        When user logs in with email "general@teacher.com" and paswword "123456"
        Then user is directed to dashboard page
        When user navigates to "Student Admission" page
        And enters admission NO "<admissionNO>"
        And enters First Name "<firstName>"
        And selects Gender "<Gender>"
        And clicks on Date of Birth "<dateOfBirth>"



        Examples:
            | admissionNO | firstName | Date of Birth | Gender | Guardian Name | Guardian Phone |
            | 12345       | Yaryna    | 04/25/1989    | Female | Yaryna        | 34567          |
            | 3456        | Ayla      | 03/12/1988    | Female | Ayla          | 34556          |
            | 5678        | Lily      | 02/20/1990    | Female | Lily          | 76590          |
            | 234456      | Diego     | 12/10/1986    | Male   | Diego         | 56834          |