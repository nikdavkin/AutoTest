import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class MessagePage {
    public MessagePage find(String name){
        $(withText(name)).click();
        return this;
    }
    public MessagePage printMessage(String message){
        $(OKValues.MESSAGE).setValue(message).pressEnter();
        return this;
    }
}
