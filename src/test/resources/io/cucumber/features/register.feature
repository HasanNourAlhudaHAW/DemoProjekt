Feature: Register Test

  Scenario: TC1: Register User
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



  Scenario: TC2: Register User With Invalid Email Format
    Given user navigates to demo shop site
    When  user clicks on register link
    And   user fills out first name field
    And   user fills out last name field
    And   user enters invalid email format
    And   user tries to enter password
    Then  user should get an error message: Wrong email


  Scenario: TC3: Register User With Existing Email
    Given user navigates to demo shop site
    When  user clicks on register link
    And   user fills out first name field
    And   user fills out last name field
    And   user enters existing email
    And   user fills out Password field
    And   user fills out confirm password field
    And   user clicks on register
    Then  user should get an error message: The specified email already exists