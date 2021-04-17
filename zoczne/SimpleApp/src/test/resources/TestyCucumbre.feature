Feature: Testy ShopManager

  Scenario: Add Single Product to Cart
    Given I have an empty Cart
    When I add a new Product into a Cart
    Then I obtain Cart with lenght 1
    Then Database was asked 2 times about product with id 1

  Scenario: Remove element from a Cart
    Given I have an empty Cart
    When I add a new Product into a Cart
    When I erase a last Product form a Cart
    Then I obtain an empty Cart

  Scenario: Add new product to a Cart
    Given I have a non empty Cart
    When I add a new Product into a Cart
    Then I obtain the same Product on last place in Cart