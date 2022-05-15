Feature: Reduce Item
	@Reduceitem1
	Scenario: I want to reduce one item of quantity in cart page
	Given I am on order page
	When I click icon minus 
	Then I verify the price of item
	And I click button bayar
	Then I am inside transaction page