package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    private final SelenideElement searchInput = $("input[name=q]");

    @Step("Search {value}")
    public SearchResultPage search(String value) {
        searchInput.setValue(value).pressEnter();
        return page(SearchResultPage.class);
    }

}
