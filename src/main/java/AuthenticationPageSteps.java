import ru.yandex.qatools.allure.annotations.Step;

public class AuthenticationPageSteps {

    private AuthenticationPage pageToVerify;

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
    public void verifyPasswordTetBoxPresence(){
        pageToVerify.getPasswordTextBox().exists();
    }

    @Step
    public void verifySignInButtonPresence(){
        pageToVerify.getSignInButton().exists();
    }

    @Step
    public void enterPassword(String password){
        pageToVerify.getPasswordTextBox().setValue(password);
    }

    @Step
    public void clickSignInButton(){
        pageToVerify.getSignInButton().click();
    }

    @Step
    public void verifyGmailMenuPresence(){
        pageToVerify.getGmailMenu().exists();
    }

}