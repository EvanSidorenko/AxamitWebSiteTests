package java.axamit.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ClientPage {
    private final SelenideElement companyTab = $("a[data-menuactivation=\"about|team|clients|news\"]");
    private final SelenideElement clientField = $(By.partialLinkText("Clients"));
    private final SelenideElement allTab = $("a[class=\"axamit-client-filter-item active\"]");

    public void hoverOnCompanyTab() {
        companyTab.hover();
    }
    public void clickOnClientsField() {
        clientField.click();
    }
    public void checkAllTabIsDisplayed() {
        allTab.shouldBe(Condition.visible);
    }

}
