# src/test/resources/greeting.feature

Feature: Greeting Feature

  Scenario: Greeting with default name
    Given the application is running
    When a user requests the greeting without a name
    Then the response should contain the default greeting message

  Scenario: Greeting with custom name
    Given the application is running
    When a user requests the greeting with the name "Spring Community"
    Then the response should contain the tailored greeting message
