@checkbox
  Feature:Checkbox and radiobutton
    Scenario: TC01 checkbox
      Given user navigates to "https://testcenter.techproeducation.com/index.php?page=checkboxes"
      Then user waits for 2 seconds
      And  unless selected select "Checkbox 1"
      Then unless selected select "Checkbox 2"
      And user keeps the page open

    #Bir feature dosyasında birden fazla test case olabilir
      @radio
      Scenario: TC02 radio
        Given user navigates to "https://testcenter.techproeducation.com/index.php?page=radio-buttons"
        Then user waits for 2 seconds
        And  unless selected select "Red"
        Then user keeps the page open


    @radioFootball
    Scenario: TC02 radio
      Given user navigates to "https://testcenter.techproeducation.com/index.php?page=radio-buttons"
      Then user waits for 2 seconds
      And  unless selected select "Football"
      Then user keeps the page open
