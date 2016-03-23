import static com.codeborne.selenide.Selenide.*;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AuthenticationPageTests {

    @Parameters({"email", "password"})
    @Test
    public void verifyGmailLoginProcedure(String email, String password){
        AuthenticationPage page = open("http://gmail.com", AuthenticationPage.class);
        AuthenticationPageSteps steps = new AuthenticationPageSteps(page);

        steps.verifyEmailTextBoxPresence();
        steps.enterEmail(email);
        steps.pressEnter();
        steps.verifyPasswordTetBoxPresence();
        steps.enterPassword(password);
        steps.verifySignInButtonPresence();
        steps.clickSignInButton();
        steps.verifyGmailMenuPresence();
    }

}