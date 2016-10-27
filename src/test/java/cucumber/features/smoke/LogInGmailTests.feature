Feature: Log in

  Scenario Outline: Test login with valid credentials
    When enter valid email "<Email>" and press next button
    And enter valid password "<Password>" and press log in button
    Then user "<Email>" should be able to log in successfully

    Examples:
      | Email           | Password |
      | _email@gmail.com | _password |