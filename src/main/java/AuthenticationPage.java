import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AuthenticationPage {

    public SelenideElement getErrorMessage(){
        return $(By.id("errormsg_0_Email"));
    }

    public SelenideElement getEmailTextBox(){
        return $(By.id("Email"));
    }

}
