Feature: Validate User Account Deletion

  Scenario: User deletes their account
    Given the user logs in with a test account
    When the user navigates to account settings
    And the user selects 'Delete Account'
    And confirms the deletion
    Then the account should be deleted
    And a confirmation message is displayed