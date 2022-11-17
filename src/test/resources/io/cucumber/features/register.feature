Feature: Register Test

  Scenario: User Registers Functionality Test
    Given user navigates to demo shop site
    When  user clicks on register link
    And   user fills out first name field
    And   user fills out last name field
    And   user fills out email field
    And   user fills out Password field
    And   user fills out confirm password field
    And   user clicks on register
    Then  user should gets Your registration completed
    When  user clicks on continue button
    Then  user should be successfully registered



  Scenario: User Registers With Invalid Inputs Functionality Test
    Given user navigates to demo shop site
    When  user clicks on register link
    And   user fills out first name field
    And   user fills out last name field
    And   user enters invalid email format
    And   user tries to enter password
    Then  user should get an error message: Wrong email