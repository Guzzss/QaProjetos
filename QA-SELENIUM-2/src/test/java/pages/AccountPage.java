package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import util.BaseTest;

public class AccountPage {

    public final static By createEmail = By.cssSelector("#email_create");
    public final static By createAccountBtn = By.cssSelector("#SubmitCreate");

    public final static By emailAddress = By.cssSelector("#email");
    public final static By password = By.cssSelector("#passwd");
    public final static By signInBtn = By.cssSelector("#SubmitLogin");

    public final static By invalidEmail = By.cssSelector("#center_column > div.alert.alert-danger > ol > li");

    Faker faker = new Faker();
    String email = faker.internet().emailAddress();
    public void criarEmail() {
        BaseTest.sendKeys(createEmail, email);
    }

    public void clicarNoCreateBtn() {
        BaseTest.click(createAccountBtn);
    }

    public void preencherEmail() {
        BaseTest.sendKeys(emailAddress, "gustavo_teichmann@outlook.com");
    }

    public void preencherSenha() {
        BaseTest.sendKeys(password, "gustavo123");
    }

    public void clicarNoSignIn() {
        BaseTest.click(signInBtn);
    }

    public void preencherEmailInvalido() {
        BaseTest.sendKeys(emailAddress, "gustavo_teichmann@outlookkkkkkkkkkkkkkkkk.com");
    }

    public String RecuperarMensagem() {
       return BaseTest.getText(invalidEmail);
    }

}
