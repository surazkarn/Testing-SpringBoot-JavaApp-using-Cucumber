Feature: Greeting API

  Scenario: Greeting with a custom name
    Given the application is running
    When a user requests a greeting with the name "Suraj"
    Then the response should contain the greeting message "Hello, Suraj!"