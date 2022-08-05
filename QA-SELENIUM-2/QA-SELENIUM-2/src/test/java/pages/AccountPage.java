package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import util.BaseTest;

public class AccountPage {

    public final static By createEmail = By.cssSelector("#email_create");
    public final static By createAccountBtn = By.cssSelector("#SubmitCreate");

    Faker faker = new Faker();
    String email = faker.internet().emailAddress();
    public void criarEmail() {
        BaseTest.sendKeys(createEmail, email);
    }

    public void clicarNoCreateBtn() {
        BaseTest.click(createAccountBtn);
    }

}
