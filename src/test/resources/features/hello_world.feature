Feature: Testing the input and output of the hello world application

  @smoke
  Scenario: Should get expected String 1 when passing it into the application
    Given I have pass in "world"
    Then I should get "hello world"

  Scenario: Should get expected String 2 when passing it into the application
    Given I have pass in "world"
    Then I should get "hello worldd"