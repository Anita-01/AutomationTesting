Feature: BuyItem
	
		@BuyItemWithoutLogin
    Scenario: As a user i want to buy item 
    Given I am on the Website 
    When I choose item
    Then I click button beli
    And I click cart menu
    And I click bayar button
    Then I am failed to pay the item
    
  @BuyOneItemWithOneClick
  Scenario: As a user i want buy one item 
    Given I am on the HomePage
    When I choose one item
    Then I click button beli
    And I click cart menu
    And I click bayar button
    Then I am on the transaction page
    
    @BuyOneItemWithTwoClick
  	Scenario: As a user i want buy one item as much one
    Given I am on the HomePage
    When I choose one item
    Then I double click button beli
    And I click cart menu
    And I click bayar button
    Then I am on the transaction page
    
    @BuyTwoItemWithOneClick
 		Scenario: As a user i want buy two item as much two
    Given I am on the HomePage
    When I choose two item
    Then I click button beli for two item 
    And I click cart menu
    And I click bayar button
    Then I am on the transaction page
    
     @BuyTwoItemWithTwoClick
 		Scenario: As a user i want buy two item as much two
    Given I am on the HomePage
    When I choose two item
    Then I double click button beli for two item
    And I click cart menu
    And I click bayar button
    Then I am on the transaction page

    @BuyMoreItemWithOneClick
    Scenario: As a user i want buy More item
    Given I am on the HomePage
    When I choose more item
    Then I click button beli for more item
    And I click cart menu
    And I click bayar button
    Then I am on the transaction page
    
    @BuyMoreItemWithTwoClick
  	Scenario: As a user i want buy More item
    Given I am on the HomePage
    When I choose more item
    Then I double click button beli for more item
    And I click cart menu
    And I click bayar button
    Then I am on the transaction page
    
    @ClickCArdWithoutBuyAnything
  	Scenario: As a user i want buy More item Without Buy Anything
    Given I am on the HomePage
    When I click cart menu AltaShop
    Then I verification alert notification

    