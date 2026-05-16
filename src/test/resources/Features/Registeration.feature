
Feature: Registration Scenarios
 Scenario Outline: Successful registration with valid details

   Given I navigate to the URL
   And I click on Account link
 And I enter "<username>" in the Username field
 And I enter "<useremail>" in the Email address field
 And I enter "<Password>" in the Password field
 And I click on the REGISTER button




 Examples:
   | username | useremail    | Password     |
   | Chaitra  | abc@gmail.com| Chaitra@1234 |