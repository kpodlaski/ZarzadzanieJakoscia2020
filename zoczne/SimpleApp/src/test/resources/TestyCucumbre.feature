Feature: Testy ShopManager

  Scenario: Add Single Product to Cart
    Given I have an empty Cart
    When I add a new Product into a Cart
    Then I obtain Cart with lenght 1

  Scenario: Add single product to a Cart
    Given I have an empty Cart
    When I add a new Product into a Cart
    Then I obtain Cart with lenght 1

  Scenario: Add new product to a Cart
    Given I have a non empty Cart
    When I add a new Product into a Cart
    Then I obtain the same Product on last place in Cart