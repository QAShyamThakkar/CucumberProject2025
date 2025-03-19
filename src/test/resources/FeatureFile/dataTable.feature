Feature: Registration Form
  Developer: Vold
  Tester: Kenneth


  Scenario: Verify user can update data on Registration Form with Vold Data

    Given verify user is on the registration page

    When user enters valid data on registration page
      | Vold             |
      | K                |
      | VoldEmail        |
      | VoldCompanyName  |
      | VoldAddress      |
      | VoldPhone Number |

    Then verify user is able to checkout

#    When user enters firstname
#    And user enters Lastname
#    And user enters Email
#    And user enters companyname
#    And user enters Address
#    And user enters PhoneNumber

