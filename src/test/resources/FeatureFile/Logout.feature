Feature: Validate Logout Functions
  Developer: Vold
  Tester: Kenneth


  Scenario: Verify user can logout
    Given user open website
    Then verify user is on the login page
    When user enters valid credentials
    And user click on Log in Button
    Then verify user is on the home page
    When user click on burger icon
    And click on logout link
    Then verify user is on the login page



