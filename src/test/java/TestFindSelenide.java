import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestFindSelenide {
    @BeforeAll
    static void beforAll(){
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void findSelenide(){
        open("https://github.com/");

        //sleep(1000);
        $("[placeholder='Search or jump to...']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("[data-testid='results-list'] div").first().$("a").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }


}
