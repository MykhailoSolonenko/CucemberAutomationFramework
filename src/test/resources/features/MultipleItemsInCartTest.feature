Feature: Test cart with multiple items

  Scenario: Verify User Can Add Multiple Items
    Given user open website
    When user do login
    Then verify user is on home page
    When user click on second item
    Then verify user is on product detail page
    When user click on add to cart button
    And  click on cart icon
    Then verify user is on cart page with second item
    When user click on continue shopping button
    Then verify user is on home page
    When user click on third item
    Then verify user is on product detail page
    When user click on add to cart button
    And click on cart icon
    Then verify two items is in cart page
    When user click on checkout button
    Then verify user is on checkout page
    When user fill all details on checkout page
    And click on continue button on checkout page
    Then verify user is on review page
    When user click on finish button
    Then verify user is on order confirmation page






