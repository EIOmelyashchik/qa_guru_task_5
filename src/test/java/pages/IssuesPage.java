package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class IssuesPage {
    private final SelenideElement issuesWrap = $("div[aria-label=Issues]");

    @Step("Check that issue '{issue}' exists")
    public void issueShouldExist(String issue) {
        issuesWrap.shouldHave(text(issue));
    }
}
