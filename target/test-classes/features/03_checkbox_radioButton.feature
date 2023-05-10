@checkbox
  Feature:Checkbox and radiobutton
    Scenario: TC01 checkbox
      Given user navigates to "https://testcenter.techproeducation.com/index.php?page=checkboxes"
      And  unless selected select "Checkbox 1"
      Then unless selected select "Checkbox 2"
