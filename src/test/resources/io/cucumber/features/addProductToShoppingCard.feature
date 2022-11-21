Feature: Add Products to Shopping Card

  Scenario: TC10: Add Products To Shopping Card
    Given user navigates to demo shop site
    When  user clicks on Books
    And   user adds book to cart
    And   user adds another book to cart
    Then  the selected books will be added to shopping cart