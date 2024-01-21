Feature: Greeting API

  Scenario: Greeting with a custom name
    Given the application is running
    When a user requests a greeting with the name "Suraj"
    Then the response should contain the greeting message "Hello, Suraj!"

  Scenario: Greeting with a different name
    Given the application is running
    When a user requests a greeting with the name "John"
    Then the response should contain the greeting message "Hello, John!"

  Scenario: Greeting with an empty name
    Given the application is running
    When a user requests a greeting with the name ""
    Then the response should contain the default greeting message "Hello, World!"

  Scenario: Greeting with a special character in the name
    Given the application is running
    When a user requests a greeting with the name "@#$%^"
    Then the response should contain the greeting message "Hello, @#$%^!"
