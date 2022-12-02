Feature: CTSMS - Ability to enable student records after disabling


    @AGO-16 @Regression @Yaryna
    Scenario: To enable student records after disabling

        Given a user logged in on the "https://chroma.mexil.it/student/search" 
        When a student is disabled
        Then a student can be enabled again