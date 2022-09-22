package java.axamit.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class JobPage {
    private final SelenideElement careerTab = $("a[data-menuactivation=\"career\"]");
    private final SelenideElement accordion = $("a[data-part=\"junior-javaaem-developer\"]");

    public void clickOnCareerTab() {
        careerTab.click();
    }

    public void checkTheJobInAccordion(String accordionData) {
        accordion.shouldHave(Condition.text(accordionData));
    }

}
