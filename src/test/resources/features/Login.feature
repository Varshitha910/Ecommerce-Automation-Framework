Feature: Login Functionality

@Smoke
Scenario: Valid Login

Given User launches Swag Labs application
When User navigates to login page
And User enters valid email and password
Then User should login successfully