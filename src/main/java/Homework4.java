import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Homework4 {
    @Test
    public void TestElit() {
        //Task 1
        open( "https://ee.ge");
        $(byText("რეგისტრაცია")).click();
        $("#firstName").shouldBe(Condition.visible);
        $("#firstName").setValue("giorgi");
        $("#firstName").shouldNotBe(Condition.empty);
        $("#lastName").setValue("aladashvili");
        $("#lastName").shouldNotBe(Condition.empty);
        $("#email").setValue(("aladdaa18@gmail.com"));
        $("#email").shouldNotBe(Condition.empty);
        $("#password").setValue("testireba");
        $("#password").shouldBe(Condition.visible);
        $("#confirmPassword").setValue("testireba");
        $("#confirmPassword").shouldBe(Condition.visible);
        $("#singup").shouldBe(Condition.enabled);

    }

    //Task 2
    @Test
    public void Testelit2(){
        open("https://ee.ge");
        $(byText("რეგისტრაცია")).click();
        $("#firstName").shouldBe(Condition.visible);
        $("#singup").shouldBe(Condition.disabled);
        $("#firstName").click();
        $("#lastName").click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
        $("#email").click();
        $(byText("გვარი სავალდებულოა")).shouldBe((Condition.visible));
        $("#password").click();
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $("#confirmPassword").click();
        $(byText("სწრაფი რეგისტრაცია")).click();
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(2000));
        $("#email").setValue("aladdaa18#gmail.com");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $("#password").setValue("12345");
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $("#password").setValue("123456");
        $("#confirmPassword").setValue("654321");
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);















    }
}
