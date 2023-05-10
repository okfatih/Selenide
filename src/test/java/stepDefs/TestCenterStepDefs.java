package stepDefs;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.*;
import pages.TestCenterPage;

import static com.codeborne.selenide.Condition.*;

public class TestCenterStepDefs {
    TestCenterPage testCenterPage = new TestCenterPage();
    @Given("user enters his\\/her username")
    public void user_enters_his_her_username() {
        testCenterPage.userName.setValue("techproed");

    }
    @Given("user enter his\\/her passoword")
    public void user_enter_his_her_passoword() {
        testCenterPage.password.setValue("SuperSecretPassword");

    }
    @When("user clicks submit button")
    public void user_clicks_submit_button() {
        testCenterPage.submitButton.click();

    }
    @Then("user verifies the successfull login")
    public void user_verifies_the_successfull_login() {
        testCenterPage.verifyLoginText.shouldBe(visible);
        /*
        ShouldBe Selenidedan gelen bir keyword
        Test fail ederse build klasörünün içersine
        ekran görüntüsü atıyor
         */

    }


    @And("unless selected select {string}")
    public void unlessSelectedSelect(String option) {
        /*
        eger option checkbox1e eşitse fakat checkbox1 seçili değilse cb1 e tıkla
         */
        if (option.equals("Checkbox 1")&& !testCenterPage.checkbox1.isSelected()){
            testCenterPage.checkbox1.click();
            testCenterPage.checkbox1.shouldBe(checked);//Selenide Assertion
            //testCenterPage.checkbox1.shouldBe(Condition.checked) Selenide Assertion uzun

        }else if (option.equals("Checkbox 2")&& !testCenterPage.checkbox2.isSelected()){
            testCenterPage.checkbox2.click();
            testCenterPage.checkbox2.shouldBe(checked);
        }
    }
}
