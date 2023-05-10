package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.*;

public class CommonStepDef {
    @Given("user navigates to {string}")
    public void user_navigates_to(String googleHome) {
        open(googleHome);// Seleniden gelen open functionı
        // sleep(10000);//Selenide browser ı otomatik olarak kapotmasın diye basit bir sleep
    }

    @Then("user waits for {int} seconds")
    public void user_waits_for_seconds(Integer int1) {
        //Selenide da default bekleme süresi 4 saniyedir
        //4 saniyeden fazla beklemek için sleep methodu kullanılır
        sleep(int1 * 1000);


    }

    @Then("user goes back to previous page")
    public void user_goes_back_to_previous_page() {
        back();
    }

    @Then("user goes back to next page")
    public void user_goes_back_to_next_page() {
        forward();
    }

    @Then("user keeps the page open")
    public void user_keeps_the_page_open() {
        refresh();
    }
}
/*
Selenide de navigasyon fonksyşonları
open(url)
back()
forward()
refresh()
 */