package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class RepositoryPage {
    private final SelenideElement tabsWrap = $("nav[aria-label=Repository]");

    @Step("Go to 'Issues' tab")
    public IssuesPage goToIssueTab() {
        tabsWrap.$(withText("Issues")).click();
        return page(IssuesPage.class);
    }
}
