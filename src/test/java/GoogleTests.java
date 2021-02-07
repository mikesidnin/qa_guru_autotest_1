import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {

    @Test
    void selenideSearchTest(){
        //Открыть гугл
        open("https://google.com");

        //Selenide
        $(byName("q")).setValue("Selenide").pressEnter();

        //Корректность результата
        $("html").shouldHave(Condition.text("ru.selenide.org"));
    }
}
