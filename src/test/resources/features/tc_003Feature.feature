Feature: Password Recovery Function

  Scenario: Validate password recovery function
    Given the user is on the login page
    When they click on the 'Forgot Password' link
    Then they are redirected to the password recovery page

    When the user enters a registered email address
    And clicks on the 'Submit' button
    Then the system shows a confirmation message

    When the user checks their email
    Then they receive a password recovery email