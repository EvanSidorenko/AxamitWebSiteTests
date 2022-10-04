package java.axamit.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import java.axamit.helpers.Attach;
import java.axamit.helpers.DriverSettings;
import java.axamit.pages.ClientPage;
import java.axamit.pages.JobPage;
import java.axamit.pages.MainPage;
import java.axamit.pages.SearchResultPage;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestBase {
    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    JobPage jobPage = new JobPage();
    ClientPage clientPage = new ClientPage();
    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DriverSettings.configure();
    }

    @BeforeEach
    void openMainPage() {
        step("open axamit.com", () -> {
            open("");
        });
    }

    @AfterEach
    void addAttachments() {
        Attach.takeScreenshot("Final screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
