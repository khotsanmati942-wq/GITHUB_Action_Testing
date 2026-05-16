
  Feature: Login Scenarios
    Scenario Outline: Successful Login with valid details

  Given I navigate to the URL
      And I click on Account link
  And I enter "<username>" in the Username or email address field
  And I enter "<Password>" in the Password field for login
  And I click on the LOG IN button


    Examples:
      | username | Password     |
      | Chaitra  | Chaitra@1234 |