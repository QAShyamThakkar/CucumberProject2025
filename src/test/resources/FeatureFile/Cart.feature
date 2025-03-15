Feature: Validate Cart Functions
  Developer: Vold
  Tester: Kenneth


  Scenario: Verify user can perform action on Cart Page
#    On Login Page
    Given user open website
    Then verify user is on the login page
    When user enters valid credentials
    And user click on Log in Button
    Then verify user is on the home page

#    On Home Page
    When user click on Add to cart button
    And click on cart button
    Then verify user is on cart page

#  On Cart Page
    When user click on checkout button
    Then Verify user on checkout page

#    On CheckOut Page
    When user enters firstname
    And user enters lastname
    And user enters zipcode
    And user click on continue button
    Then verify user is on Overview page

#  On Overview Page
    When user click on Finish button
    Then verify user is on complete page with success message

