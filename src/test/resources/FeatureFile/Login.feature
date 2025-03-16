Feature: Validate Login Functions
  Developer: Vold
  Tester: Kenneth

  Background:
    Given user open website
    Then verify user is on the login page

  @Smoke
  Scenario: Verify user can login with valid credentials
    When user enters valid credentials
    And user click on Log in Button
    Then verify user is on the home page

  Scenario: Verify user can not login with Invalid credentials
    When user enters Invalid credentials
    And user click on Log in Button
    Then verify user is getting failure message






