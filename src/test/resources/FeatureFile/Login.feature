Feature: Validate Login Functions
  Developer: Vold
  Tester: Kenneth

  Background:
    Given user open website
    Then verify user is on the login page

  @Smoke
  Scenario: Verify user can login with valid credentials
    When user enters username "vold" and password "vold123" valid credentials
    And user click on Log in Button
    Then verify user is on the home page

  Scenario Outline: Verify user can not login with Invalid credentials
    When user enters Invalid username "<username>" and password "<password>" credentials
    And user click on Log in Button
    Then verify user is getting failure message

    Examples:
      | username  | password      |
      | wrongUser | wrongPassword |
      | admin     | admin123      |
      | ADMIN     | ADMIN123      |





#  Scenario: Verify user can not login with Invalid credentials1
#    When user enters Invalid username "admin" and password "admin123" credentials
#    And user click on Log in Button
#    Then verify user is getting failure message
#
#  Scenario: Verify user can not login with Invalid credentials2
#    When user enters Invalid username "ADMIN" and password "ADMIN123" credentials
#    And user click on Log in Button
#    Then verify user is getting failure message





