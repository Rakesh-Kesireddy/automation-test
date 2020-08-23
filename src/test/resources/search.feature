Feature: Search
  As an end user
  I want do search for product
  So that i can view or buy products of my choice

  Scenario Outline: do search
    Given Iam on a homepage
    When I do a search for a product "<searchTerm>"
    Then I should be see respective products

    Examples:
      | searchTerm |
      | puma       |