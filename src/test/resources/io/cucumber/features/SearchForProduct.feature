Feature: Search For a Product In The Search Field

  Scenario: Search For A Product In Search Field And Buy It Functionality Test
    Given user navigates to demo shop site
    When  user moves to search field and types a products name
    And   user hits search button
    And   user selects the product they looking for
    And   user clicks on button Add to cart
    Then  product must be added to Shopping cart