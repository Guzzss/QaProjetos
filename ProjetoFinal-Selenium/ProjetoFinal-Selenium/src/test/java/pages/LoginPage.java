package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class LoginPage {

    private final static By username = By.cssSelector("#user-name");
    private final static By password = By.cssSelector("#password");
    private final static By loginBtn = By.cssSelector("#login-button");
    private final static By authenticationFailedMsg = By.cssSelector("#login_button_container > div > form > div.error-message-container.error");
    private final static By campoIsRequired = By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3");
    public void preencherUsername() {
        BaseTest.sendKeys(username, "standard_user");
    }

    public void preencherComCamposInvalidos() {
        BaseTest.sendKeys(username, "usernameInvalido");
        BaseTest.sendKeys(password, "passwordInvalido");
    }

    public void preencherPassword() {
         BaseTest.sendKeys(password, "secret_sauce");
    }

    public void clicarNoLoginBtn() {
        BaseTest.click(loginBtn);
    }

    public String authenticationFailedMsg() {
        return BaseTest.getText(authenticationFailedMsg);
    }

    public String campoRequired() {
        return BaseTest.getText(campoIsRequired);
    }
}
