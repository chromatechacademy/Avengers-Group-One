Feature: Ability to add and delete student categories


    @AGO-20 @Regression @Yaryna
    Scenario: Adding and deleting student categories

        Given a user is on the "https://chroma.mexil.it/site/login" Homepage
        When user logs in with email "general@teacher.com" and password "123456"
        And clics Student Admission
        And navigates to Student categories
        And user enters "API" in Category TextBox
        And clicks save and new category is added "Record Saved Successfully"
        And clicks delete
        Then new category is deleted "Record Deleted Successfully"


