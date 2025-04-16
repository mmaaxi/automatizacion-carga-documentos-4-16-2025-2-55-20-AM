Feature: Logout process

  Scenario: Validate logout process
    Given the user is logged in with valid credentials
    When the user clicks on the 'Logout' button
    Then the session should be closed and the user should be redirected to the homepage
    
    When the user attempts to access a protected URL
    Then the user should be redirected to the login page