Feature: Login Test


  Scenario Outline: Login Successful Functionality Test
    Given user navigates to demo shop site
    And   user hits Log in link
    When  user enters Email as "<email>" and Password as "<password>"
    Then  login should be successful

    Examples:
      | email                | password |
      | HasanNour8@gmail.com | 123456 |




  Scenario Outline: Login Unsuccessful Functionality Test
    Given user navigates to demo shop site
    And   user hits Log in link
    When  user enters Email as "<email>" and Password as "<password>"
    Then  login should be unsuccessful

    Examples:
      | email                   | password |
      | HasanNour8453@gmail.com | 123456   |












