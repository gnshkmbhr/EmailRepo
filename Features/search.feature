Feature: searching for the various categories along with the product search

@Books
Scenario: Select the product under the Books category

Given I visit the Amazon website as guest user
When I select the books category by selecting dropdown window
And I click on the search option
Then I should see the books page is loading
And I should see the Books page heading
But  I should not see the other category products

Scenario: Select the product under the Baby category

Given I visit the Amazon website as guest user
When I select the baby category by selecting dropdown window
And I click on the search option
Then I should see the baby page is loading
And I should see the Baby Products page heading
But  I should not see the other category products
