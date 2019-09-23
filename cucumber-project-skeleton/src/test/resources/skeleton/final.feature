Feature: TestMeApp

Scenario Outline: Multiple logins

Given user is on testmeapp home page
When user enters "<Username>" and "<password>"
Then login is successful

Examples:
|Username|password|
|Lalitha|password123|
|admin|password456|
