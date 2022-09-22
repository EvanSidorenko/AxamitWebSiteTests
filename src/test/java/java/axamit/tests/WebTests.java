package java.axamit.tests;

import axamit.helpers.DriverUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static axamit.tests.TestData.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class WebTests extends TestBase {

    @Test
    @DisplayName("Check there is no errors in console")
    void consoleShouldNotHaveErrorsTest() {
        step("Check there is no 'SEVERE' errors in console log", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            assertThat(consoleLogs).doesNotContain("SEVERE");
        });
    }

    @Test
    @DisplayName("Check the click on the logo Axamit reboots the page")
    void logoOnMainShouldBeDisplayed() {
        step("Click on the logo Axamit", () -> {
            mainPage.clickOnLogo();
        });
        step("Check the logo Axamit is displayed", () -> {
            mainPage.checkLogoOnMain();
        });
    }

    @Test
    @DisplayName("Input some data in the search field")
    void checkSearchOnMainPage() {
        step("Click on the search button", () -> {
            searchResultPage.clickOnSearchButton();
        });
        step("Input data in the search field", () -> {
            searchResultPage.inputDataInSearchField(searchData);
        });
        step("Click on the Go button", () -> {
            searchResultPage.clickOnGoButton();
        });
        step("Check the result of the search", () -> {
            searchResultPage.checkSearchResults(searchResult);
        });
    }
        @Test
        @DisplayName("Check a job  \"Junior Java/AEM Developer\" is displayed in the career page")
        void checkAJobIsDisplayedInCareerPage() {
            step("Click on the career tab", () -> {
                jobPage.clickOnCareerTab();
            });
            step("Check the job is displayed in the accordion", () -> {
                jobPage.checkTheJobInAccordion(accordionData);
            });
        }

            @Test
            @DisplayName("Check the All tab is displayed in the clients page")
            void checkTheAllTabIsDisplayedInTheClientsPage(){
                step("Hover on the company tab", () -> {
                    clientPage.hoverOnCompanyTab();
                });
                step("Click on the Client field", () -> {
                    clientPage.clickOnClientsField();
                });
                step("Check the All tab is visible", () -> {
                    clientPage.checkAllTabIsDisplayed();
                });
            }

}
