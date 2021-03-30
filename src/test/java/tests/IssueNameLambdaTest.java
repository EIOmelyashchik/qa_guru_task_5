package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@DisplayName("Tests with allure lambda-steps")
public class IssueNameLambdaTest extends TestBase {
    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String ISSUE_NAME = "Listeners NamedBy";

    @Test
    @Owner("omelyashchik")
    @Feature("Issues")
    @DisplayName("Issue '" + ISSUE_NAME + "' should exist in '" + REPOSITORY + "' repository")
    void checkIssueName() {
        step("Open page " + Configuration.baseUrl, () ->
                open(""));

        step("Search repository '" + REPOSITORY + "'", () ->
                $("input[name=q]").setValue(REPOSITORY).pressEnter());

        step("Click on '" + REPOSITORY + "' repository", () ->
                $("ul.repo-list").$(byLinkText(REPOSITORY)).click());

        step("Go to 'Issues' tab", () ->
                $("nav[aria-label=Repository]").$(withText("Issues")).click());

        step("Check that Issue '" + ISSUE_NAME + "' exists", () ->
                $("div[aria-label=Issues]").shouldHave(text(ISSUE_NAME)));
    }
}
