Feature: Test the login functionality

@ninja
Scenario: Test with the valid login credentials
	Given Navigate to tutorialsninja website
	When Enter the valid Username gnshkmbhr25@gmail.com and Password gnshkmbhr into the login fields
	Then I clicks on Login button
	And User should login successfully
	