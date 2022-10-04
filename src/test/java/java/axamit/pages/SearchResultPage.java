package java.axamit.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {
    private final SelenideElement searchButton = $("#search-icon");
    private final SelenideElement searchField = $("#header-lg-search");
    private final SelenideElement goButton = $("button[type=\"submit\"]");
    private final SelenideElement resultField = $("a[href=\"/blog/adobe/dispatcher-1\"]");

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void inputDataInSearchField(String searchData) {
        searchField.setValue(searchData);
    }

    public void clickOnGoButton() {
        goButton.click();
    }

    public void checkSearchResults(String searchResult) {
        resultField.shouldHave(Condition.text(searchResult));
    }
}
