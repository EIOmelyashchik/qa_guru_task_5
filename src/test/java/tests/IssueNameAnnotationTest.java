package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

@DisplayName("Tests with allure step-annotation")
public class IssueNameAnnotationTest extends TestBase {
    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String ISSUE_NAME = "Listeners NamedBy1";

    @Test
    @Owner("omelyashchik")
    @Feature("Issues")
    @DisplayName("Issue '" + ISSUE_NAME + "' should exist in '" + REPOSITORY + "' repository")
    void checkIssueName() {
        open("/", MainPage.class)
                .search(REPOSITORY)
                .clickOnRepository(REPOSITORY)
                .goToIssueTab()
                .issueShouldExist(ISSUE_NAME);
    }
}
