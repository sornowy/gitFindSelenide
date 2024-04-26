import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class TestContibutors {
    @Test
    void testContributors(){
        browserSize = "1920x1080";
        open("https://github.com/selenide/selenide");

        $("div.Layout-sidebar").$(byText("Contributors"))
                        //.closest("BorderGrid-cell").$$("ul li").first().hover();
                        .closest("h2").sibling(0).$$("li").first().hover();
        $(".Popover-message").shouldHave(text("Andrei Solntsev"));
        sleep(10000);
    }
}
