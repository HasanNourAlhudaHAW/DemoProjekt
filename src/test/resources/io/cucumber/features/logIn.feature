Feature: Login Test


  Scenario Outline: TC4: Login User with correct email and password
    Given user navigates to demo shop site
    And   user hits Log in link
    When  user enters Email as "<email>" and Password as "<password>"
    Then  login should be successful

    Examples:
      | email                | password |
      | HasanNour8@gmail.com | 123456 |




  Scenario Outline: TC5: Login Unsuccessful Functionality Test
    Given user navigates to demo shop site
    And   user hits Log in link
    When  user enters Email as "<email>" and Password as "<password>"
    Then  login should be unsuccessful

    Examples:
      | email                   | password |
      | HasanNour8453@gmail.com | 123456   |


  Scenario: TC13: Verify the above links
    Given user navigates to demo shop site
    And   register link is visible
    And   log in link is visible
    And   Shopping cart link is visible
    And   wishlist link is visible







