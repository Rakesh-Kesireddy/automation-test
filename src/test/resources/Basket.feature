@basket
Feature: Basket
  As an end user
  I want do search for product
  So that i can view or buy products of my choice

  @allenv @smoke @MVN-89876
  Scenario: Add product to basket
    Given Iam on a homepage
    When I do a search for a product "puma"
    Then I should be see respective products
