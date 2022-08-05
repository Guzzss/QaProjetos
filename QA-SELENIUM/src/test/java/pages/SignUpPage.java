package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class SignUpPage {

    HomePage homePage = new HomePage();

//    public static final By btnSignUp = By.cssSelector("#navbarColor01 > form > ul > li:nth-child(1) > a");

    public static final By firstName = By.cssSelector("#FirstName");
    public static final By surname = By.cssSelector("#Surname");
    public static final By E_post = By.cssSelector("#E_post");
    public static final By mobile = By.cssSelector("#Mobile");
    public static final By username = By.cssSelector("#Username");
    public static final By password = By.cssSelector("#Password");
    public static final By confirmPassword = By.cssSelector("#ConfirmPassword");
    public static final By submiteBtn = By.cssSelector("#submit");

    public static final By msgSucessRegistration = By.cssSelector("body > div > form > div > div:nth-child(11) > div > label");

    public void clicarBtnSignUp() {
        BaseTest.click(homePage.btnSignUp);
    }

    public void preencherFirstName() {
        BaseTest.sendKeys(firstName, "Gustavo");
    }

    public void preencherSurname() {
        BaseTest.sendKeys(surname, "Teichmann");
    }

    public void preencherEpost() {
        BaseTest.sendKeys(E_post, "93227726-90");
    }

    public void preencherMobile() {
        BaseTest.sendKeys(mobile, "051998986053");
    }

    public void preencherUsername() {
        BaseTest.sendKeys(username, "gustavoT");
    }

    public void preencherPassword() {
        BaseTest.sendKeys(password, "gustavo2302");
    }

    public void preencherConfirmPassword() {
        BaseTest.sendKeys(confirmPassword, "gustavo2302");
    }

    public void clicarNoSubmite() {
        BaseTest.click(submiteBtn);
    }

    public String validarMsg() {
        return BaseTest.getText(msgSucessRegistration);
    }

//    public String validarFirstName() {
//        return BaseTest.getText();
//    }


}
