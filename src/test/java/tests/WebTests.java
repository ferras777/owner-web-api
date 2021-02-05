package tests;

import com.codeborne.selenide.Configuration;
import config.WebConfigHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTests {

    String searchURl = WebConfigHelper.getSearchUrl();

    @BeforeAll
    static void beforeAll() {
        Configuration.remote = WebConfigHelper.getWebdriverRemote();
        Configuration.browser = WebConfigHelper.getBrowserName();
        Configuration.browserVersion = WebConfigHelper.getBrowserVersion();
        Configuration.browserSize = WebConfigHelper.getBrowserSize();
    }

    @Test
    void selenideSearchTest() {
        open(searchURl);
        $(byName("text")).setValue("yandex").pressEnter();
        $("html").shouldHave(text("yandex"));
    }
}
