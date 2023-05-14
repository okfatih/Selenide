@iframe
  Feature: Iframe test
    Scenario: TC01 iframe
      Given user navigates to "https://testcenter.techproeducation.com/index.php?page=iframe"
      Then  user switches to iframe 1
      And   user clicks on  back to techproeducation.com link
      Then user switches to window 2
      Then user keeps the page open