package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class WhitListPage {

    public static final By whitListName = By.cssSelector("#name");

    public static final By saveBtn = By.cssSelector("#submitWishlist");

    public static final By cardBtn = By.cssSelector("#best-sellers_block_right > div > ul > li:nth-child(1) > a");
    public void preencheWhitListName() {
        BaseTest.sendKeys(whitListName, "Minha Lista");
    }

    public void clicarNoSave() {
        BaseTest.click(saveBtn);
    }

    public void clicarNoCard() {
        BaseTest.click(cardBtn);
    }
}
