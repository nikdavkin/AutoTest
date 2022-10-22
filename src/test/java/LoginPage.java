import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    public LoginPage open(){
        Selenide.open("/");
        return this;
    }
    public void Authorization(String login, String password){
        $(OKValues.LOGIN_BUTTON).setValue(login);
        $(OKValues.PASSWORD_BUTTON).setValue(password).pressEnter();
    }
}
