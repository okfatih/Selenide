@jsalert
Feature:JS Alerts
  Scenario:TC01 alerts
    Given user navigates to "https://testcenter.techproeducation.com/index.php?page=javascript-alerts"
    And  user clicks on alert button
    Then user types "Hello" in the alert button and clicks Ok
    And user verifies that "hello" appears on the screen
