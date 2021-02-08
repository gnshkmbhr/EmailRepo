Feature: To register an account on tutorialsninja website

@register
Scenario: Enter the valid registration details
	Given User should Navigate to the tutorialsninja registration web page
	When User should provides following details to the fields
			|firstname	|Ganesh 							|
			|Lastname   |Kumbhar							|
			|emailID		|gnshkmbhr25@gmail.com|
			|telephone	|12797869							|
			|password		|gnshkmbhr						|
	
	And User should click on agree the policy
	And User should click on Continue button
	Then User should registered successfully