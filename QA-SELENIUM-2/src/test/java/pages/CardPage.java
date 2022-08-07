package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class CardPage {

    public static final By addToWhitListBtn = By.cssSelector("#wishlist_button");

    public static final By fecharMensagem = By.cssSelector("#product > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a");

    public void clicarNoAddToWhitList() {
        BaseTest.click(addToWhitListBtn);
    }

    public void clicarNoFecharMensagem() {
        BaseTest.click(fecharMensagem);
    }

}
