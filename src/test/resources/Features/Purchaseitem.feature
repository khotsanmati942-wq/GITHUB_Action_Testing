
Feature: Purchase Scenarios
  Scenario Outline: Successful Purchase of an item

    Given I navigate to the URL
    And I click on Account link
    And I enter "<username>" in the Username or email address field
    And I enter "<Password>" in the Password field for login
    And I click on the LOG IN button
    And I navigate to home screen
    And I select a product and I click on Add to cart
    Then I click on view cart button which appeared below add to cart button
    And I click on proceed to pay
    And I click on place order
    And I navigate to home screen


    Examples:
      | username | Password     |
      | Chaitra  | Chaitra@1234 |