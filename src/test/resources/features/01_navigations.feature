@navigation
Feature: navigations
  Scenario: navigation test
    Given user navigates to "https://www.google.com"
    And   user waits for 2 seconds
    Then  user navigates to "https://www.amazon.com"
    And   user waits for 2 seconds
    Then  user goes back to previous page
    And   user waits for 2 seconds
    Then  user goes to next page
    And   user waits for 2 seconds
    And   user refreshes the page
    And   user waits for 2 seconds
    And   user keeps the page open