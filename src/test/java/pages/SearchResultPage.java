package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SearchResultPage {
    private final SelenideElement repositoriesWrap = $("ul.repo-list");

    @Step("Click on '{repo}' repository")
    public RepositoryPage clickOnRepository(String repo) {
        repositoriesWrap.$(byLinkText(repo)).click();
        return page(RepositoryPage.class);
    }
}
