Feature: To check the Login functionality with various credentials

@All
Scenario Outline: to check login with valid credentials

Given I open the omayo blogspot website
When I navigate to Username and Password fields
Then I Enter Username as "<Username>" field
And I Enter Password as "<Password>" field
Then I clicked on Login button
And LoginStatus "<LoginStatus>" should show

Examples: 
|Username				|Password		|LoginStatus|
|Ganesh	 				|GaneshK		|Failure    |
