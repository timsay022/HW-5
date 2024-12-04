package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class EnterprisePageLoadTest {

    @Test
    void openEnterprisePage() {
        open("https://github.com/");
        $(".HeaderMenu-nav").$(byTagAndText("button", "Solutions")).hover();
        $(".HeaderMenu-nav").$(byTagAndText("a", "Enterprises")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));

    }
}
