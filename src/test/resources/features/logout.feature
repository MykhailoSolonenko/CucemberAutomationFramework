Feature: This feature file to test functionality related to logout

  Scenario: Verify User can logout
    Given  user open website
    When user do login
    Then verify user is on home page
    Then user click on Burger Menu
    And user click on Logout Link
    Then verify user is on login page