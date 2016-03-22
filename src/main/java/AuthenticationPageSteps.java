import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Condition.text;

public class AuthenticationPageSteps {

    private AuthenticationPage pageToVerify;
    private final String INVALID_EMAIL_MESSAGE = "Sorry, Google doesn't recognize that email";

    public AuthenticationPageSteps(AuthenticationPage page){
        this.pageToVerify = page;
    }


    @Step
    public void verifyEmailTextBoxPresence(){
        pageToVerify.getEmailTextBox().exists();
    }

    @Step
    public void enterEmail(String login){
        pageToVerify.getEmailTextBox().setValue(login);
    }

    @Step
    public void pressEnter(){
        pageToVerify.getEmailTextBox().pressEnter();
    }

    @Step
    public void verifyErrorMessageLabelPresence(){
        pageToVerify.getErrorMessage().exists();
    }

    @Step
    public void verifyErrorMessageText(){
        pageToVerify.getErrorMessage().shouldHave(text(INVALID_EMAIL_MESSAGE));
    }

}