import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class UrokChetiredva {

    @Test
    void Solution() {
        Configuration.holdBrowserOpen = true; // Оставляем окно браузера открытым
        open("https://github.com/home");
        $(byTagAndText("button", "Solutions")).hover();
        $("li a[href='https://github.com/enterprise']").shouldHave(text("Enterprises")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));

    }
}
