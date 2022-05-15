Feature: Rating Product

  @GiveRatingToProduct
  Scenario: As a user i want to give rating product in AltaShop
    Given I am on the HomePage
    When I choose one item to give rating
    Then I give rating to the product
