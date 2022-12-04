Feature: CTSMS - Ability to enable student records after disabling


    @AGO-15 @AGO-16 @Regression @Yaryna
    Scenario: To enable student records after disabling
        Given a user logged in on the "https://chroma.mexil.it/student/search" with valid credentials "general@teacher.com"  and "123456"
        And a student is disabled in "SDET" Class and "Database Testing" Section
        Then a student can be enabled again in "SDET" Class