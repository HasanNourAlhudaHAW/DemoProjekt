Feature: Search For a Product In The Search Field

  Scenario: TC9: User Search For Product And Add It To Shopping Cart
    Given user navigates to demo shop site
    When  user moves to search field and types a products name
    And   user hits search button
    And   user selects the product they looking for
    And   user clicks on button Add to cart
    Then  product must be added to Shopping cart