package java.axamit.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement logoOnMain = $("div[class=\"axamit-sprite axamit-sprite-logo-v1\"]");
    public void clickOnLogo() { logoOnMain.click(); }
    public void checkLogoOnMain() { logoOnMain.shouldBe(Condition.visible); }

}
