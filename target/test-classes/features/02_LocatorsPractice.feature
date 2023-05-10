@locators
Feature:locators

  Scenario: TC01 locators
    Given user navigates to "https://testcenter.techproeducation.com/index.php?page=form-authentication"
    And user waits for 2 seconds
    And user enters his/her username
    And user waits for 2 seconds
    And user enter his/her passoword
    And user waits for 2 seconds
    When user clicks submit button
    And user waits for 2 seconds
    Then user verifies the successfull login


  # 1.feature file oluşturduk
  # 2. test caseler yazdık
  # 3.yeni test adımları için step definitions(java methodları) oluşturduk
  # 4. page class oluştur