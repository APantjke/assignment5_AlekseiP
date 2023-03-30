Feature: Google account sign up
  Scenario: Create a google account
    Given I launch google browser for google
    When I open google sign up webpage
    Then I enter user data and process next button
    And Close browser for Google