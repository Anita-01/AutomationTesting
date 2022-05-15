Feature: Add Item

  @additem1
  Scenario: I want to add one item of quantity in cart page
    Given I am on order page
    When I click icon plus
    Then I verify the price of item
    And I click button bayar
    Then I am inside transaction page

  @additem2
  Scenario: I want to add two item of quantity in cart page
    Given I am on order page 
    When I click icon plus as twice
    Then I verify the price of item
    And I click button bayar
    Then I am inside transaction page

  @additem3
  Scenario: I want to add one hundred item of quantity in cart page
    Given I am on order page
    When I click icon plus as many one hundred
    Then I verify the price of item
    And I click button bayar
    Then I am inside transaction page
   
