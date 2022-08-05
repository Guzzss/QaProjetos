package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class DeletePage {

    public static final By deleteBtnDefinitivo = By.cssSelector("body > div > div > form > div > input");

    public void deleteBtnDefinitivo() {
        BaseTest.click(deleteBtnDefinitivo);
    }
}
