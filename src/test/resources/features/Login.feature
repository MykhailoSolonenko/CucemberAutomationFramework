Feature: This feature file to test functionality related to login


  @Regression
  Scenario: Verify User can login
    Given  user open website
    When user do login
    Then verify user is on home page