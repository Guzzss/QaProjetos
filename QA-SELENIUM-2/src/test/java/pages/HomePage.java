package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class HomePage {

    public final static By signInBtn = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");

    public void clicarNoSignInBtn() {
        BaseTest.click(signInBtn);
    }
}
