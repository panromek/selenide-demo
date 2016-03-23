import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AuthenticationPage {

    public SelenideElement getEmailTextBox(){
        return $(By.id("Email"));
    }

    public SelenideElement getPasswordTextBox(){
        return $(By.id("Passwd"));
    }

    public SelenideElement getSignInButton(){
        return $(By.id("signIn"));
    }

    public SelenideElement getGmailMenu(){
        return $(By.className("nM"));
    }

}
