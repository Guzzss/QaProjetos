package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class LoginPage  {

    HomePage homePage = new HomePage();

    public void clicarBtnLogin() {
        BaseTest.click(homePage.btnLogin);
    }

    public static final By loginUsername = By.cssSelector("#Username");

    public static final By loginPassword = By.cssSelector("#Password");

    public static final By loginbtn = By.cssSelector("body > div > div:nth-child(4) > form > table > tbody > tr:nth-child(7) > td:nth-child(2) > input.btn.btn-primary");

    public void preencherUsername() {
        BaseTest.sendKeys(loginUsername, "gustavo");
    }

    public void preencherPassword() {
        BaseTest.sendKeys(loginPassword, "gustavo23");
    }

    public void clicarNoLogin() {
        BaseTest.click(loginbtn);
    }
}
