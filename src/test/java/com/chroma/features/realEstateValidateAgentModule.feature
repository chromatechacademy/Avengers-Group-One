Feature:Real Estate - Validate Agent Module Text
As an admin user, when I navigate to the “Agents” page, then I am able to view the following text:
Members List
Active
Inactive
All Agents
Add Now
Name
Mail
Contact Number
Actions

@Ayla @AGO44 @Regression
Scenario:AGO-44 Real Estate - Validate Agent Module Text
Given a user is on the Chroma Tech Academy Real Estate Login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
When user logs in with the valid credentials email "admin@mexil.it" and password "123456"
And navigates to the Agents tab
Then text elements "people_outline Members List", "Active", "Inactive", "All Agents", "Add Now", "NAME", "MAIL", "CONTACT NUMBER", "ACTIONS", are visible











