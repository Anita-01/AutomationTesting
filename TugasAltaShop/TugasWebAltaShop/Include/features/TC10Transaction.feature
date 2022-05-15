Feature: Transaction 
	@ascendingProduk
  Scenario: I want to filter item in transaction page
    Given I add item in AltaShop
    When I am on the Transaction Page
    Then I filter the item by produk

  @ascendingHarga
  Scenario: I want to filter item in transaction page
    Given I add item in AltaShop
    When I am on the Transaction Page
    Then I filter the item by Harga

  @ascendingBanyaknya
  Scenario: I want to filter item in transaction page
    Given I add item in AltaShop
    When I am on the Transaction Page
    Then I filter the item by Banyaknya

  @ascendingSub-Total
  Scenario: I want to filter item in transaction page
    Given I add item in AltaShop
    When I am on the Transaction Page
    Then I filter the item by Subtotal

  #Descending
  @descendingProduk
  Scenario: I want to filter item in transaction page
    Given I add item in AltaShop
    When I am on the Transaction Page
    Then I filter the item by produk_1

  @descendingHarga
  Scenario: I want to filter item in transaction page
    Given I add item in AltaShop
    When I am on the Transaction Page
    Then I filter the item by Harga_1

  @descendingBanyaknya
  Scenario: I want to filter item in transaction page
    Given I add item in AltaShop
    When I am on the Transaction Page
    Then I filter the item by Banyaknya_1

  @descendingSub-Total
  Scenario: I want to filter item in transaction page
    Given I add item in AltaShop
    When I am on the Transaction Page
    Then I filter the item by Subtotal_1

  @Select-Option
  Scenario: I want to display the data based on the total
    Given I add item in AltaShop
    When I am on the Transaction Page
    And I select rows option page
    