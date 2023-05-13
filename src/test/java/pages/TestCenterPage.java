package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestCenterPage {
    // kullanci adı
    // kullanici şifresi
    // submit buttonu
    public SelenideElement userName = $(By.id("exampleInputEmail1"));
    public SelenideElement password = $(By.name("password"));
    public SelenideElement passwordCSS = $("#exampleInputPassword1");
    public SelenideElement submitButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement verifyLoginText = $(By.xpath("//*[contains(text(),'You logged into a secure area!')]"));

    //Checkbox elementleri

    public SelenideElement checkbox1 = $(By.id("box1"));
    public SelenideElement checkbox2 = $(By.id("box2"));

    //Radio elementleri
    public SelenideElement radioRed = $(By.id("red"));
    public SelenideElement radioFootball = $(By.id("football"));

    //DropDown elementleri
    public SelenideElement year = $(By.id("year"));
    public SelenideElement month = $(By.id("month"));

    public SelenideElement day = $(By.id("day"));


}
