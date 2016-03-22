import static com.codeborne.selenide.Selenide.*;
import org.testng.annotations.Test;

public class AuthenticationPageTests {

    @Test
    public void verifyInvalidEmailMessage(){
        AuthenticationPage page = open("http://gmail.com", AuthenticationPage.class);
        AuthenticationPageSteps steps = new AuthenticationPageSteps(page);

        steps.verifyEmailTextBoxPresence();
        steps.enterEmail("some-text");
        steps.pressEnter();
        steps.verifyErrorMessageLabelPresence();
        steps.verifyErrorMessageText();
    }

}