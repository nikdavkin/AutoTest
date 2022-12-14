import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MyTest {

    @BeforeClass
    public static void setup(){
        Configuration.baseUrl="https://ok.ru/";
    }

    @Test
    public void ok() {
        LoginPage login = new LoginPage();
        MainPage main = new MainPage();
        MessagePage message = new MessagePage();
        login.open().Authorization(OKValues.LOGIN,OKValues.PASSWORD);
        main.openMessages();
        message.find("Спутник").printMessage("Привет");
        //Почему-то не работает, если есть непрочитанное сообщение от спутника. Поэтому сначала надо прочитать, а потом запускать тест.
        closeWebDriver();
    }
}
