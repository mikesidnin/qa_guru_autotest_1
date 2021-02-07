import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideExample {
    String name = "Mike Sidnin",
           email = "mikhailsidnin@gmail.com",
           address = "some address",
           permanent = "some address";

    @Test
    @DisplayName("clean")
    void fillFormTestClean(){

        open("https://demoqa.com/text-box");

        // $(by("id, class, type, etc","value"))
        $(by("id","userName")).val(name);

        //$x("//input[@id='userEmail']")
        $x("//input[@id='userEmail']").val(email);

        //$(""); - default css selector. For id add "#..."
        $("#currentAddress").val(address);

        //$("[id='permanentAddress']"); - default css selector. For id add "#..."
        $("[id='permanentAddress']").val(permanent);

        //$(byClassName("form-control")).val("permanent address");

        //Button click
        $("#submit").click();

        //Path 1.--------------------------------------------------------------------
        $("#name").shouldHave(text(name));
        $("#email").shouldHave(text(email));
        $("#currentAddress").shouldHave(value(address));
        $("#permanentAddress").shouldHave(value(permanent));
        //---------------------------------------------------------------------------
    }
    @Test
    @DisplayName("straightforward")
    void fillFormTestStraightforward() {

        open("https://demoqa.com/text-box");

        // $(by("id, class, type, etc","value"))
        $(by("id", "userName")).val(name);

        //$x("//input[@id='userEmail']")
        $x("//input[@id='userEmail']").val(email);

        //$(""); - default css selector. For id add "#..."
        $("#currentAddress").val(address);

        //$("[id='permanentAddress']"); - default css selector. For id add "#..."
        $("[id='permanentAddress']").val(permanent);

        //$(byClassName("form-control")).val("permanent address");

        //Button click
        $("#submit").click();

        //Path 2---------------------------------------------------------------------------
        $("#output").shouldHave(text(
                "Name:" + name + "\n" +
                "Email:" + email + "\n" +
                "Current Address :" + address + "\n" +
                "Permananet Address :" + permanent));
        //----------------------------------------------------------------------------------
    }
}
