package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class HomePage {

    public final static By addMochilhaToCartBtn = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    public final static By addLampadaToCartBtn = By.cssSelector("#add-to-cart-sauce-labs-bike-light");
    public final static By addTshirtCinzaToCartBtn = By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt");
    public final static By addJaquetaToCartBtn = By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket");
    public final static By addCamisaOnesieToCartBtn = By.cssSelector("#add-to-cart-sauce-labs-onesie");
    public final static By cartBtn = By.cssSelector("#shopping_cart_container > a");

    public void clicarNoAddMochilhaToCardBtn() {
        BaseTest.click(addMochilhaToCartBtn);
    }

    public void clicarNoAddLampadaToCardBtn() {
        BaseTest.click(addLampadaToCartBtn);
    }

    public void clicarNoAddTshirtCinzaToCardBtn() {
        BaseTest.click(addTshirtCinzaToCartBtn);
    }

    public void clicarNoAddJaquetaToCardBtn() {
        BaseTest.click(addJaquetaToCartBtn);
    }

    public void clicarNoAddCamisaOnesieToCardBtn() {
        BaseTest.click(addCamisaOnesieToCartBtn);
    }

    public void clicarNoCartBtn() {
        BaseTest.click(cartBtn);
    }

    public String verificarAddToCardMsgToMochila() {
       return BaseTest.getText(addMochilhaToCartBtn);
    }

    public String verificarAddToCardMsgToLampada() {
       return BaseTest.getText(addLampadaToCartBtn);
    }

    public String verificarAddToCardMsgToTshirtCinza() {
       return BaseTest.getText(addTshirtCinzaToCartBtn);
    }

    public String verificarAddToCardMsgToJaqueta() {
       return BaseTest.getText(addJaquetaToCartBtn);
    }

    public String verificarAddToCardMsgToCamisaOnesie() {
       return BaseTest.getText(addCamisaOnesieToCartBtn);
    }
}
