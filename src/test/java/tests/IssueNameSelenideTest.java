package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class IssueNameSelenideTest extends TestBase {
    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String ISSUE_NAME = "Listeners NamedBy";

    @Test
    void checkIssueName() {
        open("/");

        $("input[name=q]").setValue(REPOSITORY).pressEnter();
        $("ul.repo-list").$(byLinkText(REPOSITORY)).click();
        $("nav[aria-label=Repository]").$(withText("Issues")).click();
        $("div[aria-label=Issues]").shouldHave(text(ISSUE_NAME));
    }
}
