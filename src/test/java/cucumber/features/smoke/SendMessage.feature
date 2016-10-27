Feature: Messaging

  Scenario Outline: One user sends message to another
    Given log in with email "<Email>" and password "<Password>"
    When user send message to receiver "<To>" with subject "<Subject>" and message "<Message>"
    Then message appeared on sent page "<Subject>"
    And receiver received message and it appeared on inbox page "<Subject>"

    Examples:
      | Email            | Password  | Subject   | Message | To                  |
      | _email@gmail.com | _password | CucumberS | Test    | _to_email@gmail.com |