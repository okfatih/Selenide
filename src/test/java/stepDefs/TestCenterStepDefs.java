package stepDefs;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.conditions.webdriver.Url;
import io.cucumber.core.options.CurlOption;
import io.cucumber.java.en.*;
import pages.TestCenterPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.url;
import static java.lang.Thread.sleep;

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
        if (option.equals("Checkbox 1") && !testCenterPage.checkbox1.isSelected()) {
            testCenterPage.checkbox1.click();
            testCenterPage.checkbox1.shouldBe(checked);//Selenide Assertion
            //testCenterPage.checkbox1.shouldBe(Condition.checked) Selenide Assertion uzun

        } else if (option.equals("Checkbox 2") && !testCenterPage.checkbox2.isSelected()) {
            testCenterPage.checkbox2.shouldNotBe(checked);//Seçili olmadığını doğrula
            testCenterPage.checkbox2.click();
            testCenterPage.checkbox2.shouldBe(checked);
        }
        if (option.equals("Red") && !testCenterPage.radioRed.isSelected()) {
            testCenterPage.radioRed.shouldNotBe(checked);//Sayfa açılır açılmaz tıklanmadığından emin ol
            testCenterPage.radioRed.click();
            testCenterPage.radioRed.shouldBe(checked);
        }
        if (option.equals("Football") && !testCenterPage.radioFootball.isSelected()) {
            testCenterPage.radioFootball.shouldNotBe(checked);
            testCenterPage.radioFootball.click();
            testCenterPage.radioFootball.shouldBe(checked);
        }
    }
    //DropDown Step Definitions
    @Given("user enters {int} as year, {string} as month, {int} as day")
    public void user_enters_as_year_as_month_as_day(Integer year, String month, Integer day) throws InterruptedException {

        testCenterPage.year.selectOption(String.valueOf(year));
        //SelectOption içersine direkt integer bir value koyduğumuzda index olarak algılıyor.
        sleep(2000);
        testCenterPage.month.selectOption(month); //Görünen metin ile seçtik
        sleep(2000);
        testCenterPage.day.selectOptionByValue(String.valueOf(day));
        Configuration.holdBrowserOpen = true;
    }
    //JavaScript Alert Step Definitions

    @And("user clicks on alert button")
    public void user_clicks_on_alert_button() {
       testCenterPage.promptButton.click();
    }


    @Then("user types {string} in the alert button and clicks Ok")
    public void userTypesInTheAlertButtonAndClicksOk(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        switchTo().alert().sendKeys(arg0);
        Thread.sleep(2000);
        switchTo().alert().accept();
       Thread.sleep(1000);
    }

    @And("user verifies that {string} appears on the screen")
    public void userVerifiesThatAppearsOnTheScreen(String arg0) {

        testCenterPage.result.shouldHave(text(arg0));
        System.out.println("Metin" + testCenterPage.result.getText());
        Configuration.holdBrowserOpen = true;
    }

    @Then("user switches to iframe {int}")
    public void userSwitchesToIframe(int frame) {
        switchTo().frame(frame-1); //Features files dan gelen 1 rakamını pass etti fakat index 0 dan başlar dolayısıyla -1 yaparsak 0.indexteki frame ulaşırız
        
    }

    @And("user clicks on  back to techproeducation.com link")
    public void userClicksOnBackToTechproeducationComLink() {
        testCenterPage.iframeLink.click();
        //Tıklayıp yeni bir sayfaya geçmemize rağmen
        //driver hala ilk sayfada
        System.out.println("Sayfa Urli" + url());;

    }

    @Then("user switches to window {int}")
    public void userSwitchesToWindow(int targetWindowIndex) {
        switchTo().window(targetWindowIndex-1); //Featuresdan buraya pass edilen değer 2. Arzu ettiğimiz window 1. indexte
        System.out.println("Yeni sayfa urli " + url());
    }
}
