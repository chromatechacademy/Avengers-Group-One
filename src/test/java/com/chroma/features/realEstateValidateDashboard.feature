Feature: Real Estate - Validate Dashboard Texts and Tabs
As an admin user, I want to be able to validate the following elements and their text display on the dashboard:
Dashboard
Hello, Admin
Overview
Agents Graph
Properties Overview
Properties

And the following tabs display:
Agents
Dashboard

@Ayla @AGO42 @Smoke
Scenario: AGO-42 Real Estate - Validate Dashboard Texts and Tabs
Given a user is on the Chroma Tech Academy Real Estate Login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
When user logs in with the valid credentials email "admin@mexil.it" and password "123456"
Then the text elements "Dashboard" ,"Hello, Admin" , "Overview", "Agents Graph", "Properties Overview", "Properties" display on the Dashboard
And the tabs "Agents" , "Dashboard" display














