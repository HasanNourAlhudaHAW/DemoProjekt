Feature: Account Page Feature

  Background:
    Given User has already logged in to Application
     |email|password|
     |HasanNour8@gmail.com|123456|


  Scenario: Log Out Functionality Test
    Given user is on account page
    When  user hits the Log out button
    Then  user should be logged out



  Scenario: Subscribe For Newsletters Functionality Test
    Given user is on account page
    When  user enters an email address in the Subscribe field
    And   user hits the Subscribe button for newsletters
    Then  user should be subscribed and get message Thank you for signing up!



  Scenario: Make sure the above menu bar exists
    Given user is on account page
    And "BOOKS" is visible
    And "COMPUTERS" is visible
    And "ELECTRONICS" is visible
    And "APPAREL & SHOES" is visible
    And "DIGITAL DOWNLOADS" is visible
    And "JEWELRY" is visible
    And "GIFT CARDS" is visible



  Scenario: Adding Gift Card to WishList Functionality Test
    Given user is on account page
    When user moves to gift card on the bar
    And  user selects a gift card
    And  user enters the recipient's name
    And  user enters the recipient's email
    And  user hits the button Add to wishlist
    Then user should receive the message The product has been added to your wishlist
    When user moves to wishList
    And  user selects a gift card to remove
    And  user hits update button
    Then the selected gift card must be deleted

