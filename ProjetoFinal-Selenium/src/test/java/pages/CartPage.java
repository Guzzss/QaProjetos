package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class CartPage {

    public final static By checkoutBtn = By.cssSelector("#checkout");
    public final static By continueShoppingBtn = By.cssSelector("#continue-shopping");

    private static final By removeMochilaBtn = By.cssSelector("#remove-sauce-labs-backpack");
    private static final By removeLampadaBtn = By.cssSelector("#remove-sauce-labs-bike-light");
    private static final By removeCamisaCinzaBtn = By.cssSelector("#remove-sauce-labs-bolt-t-shirt");
    private static final By removeJaquetaBtn = By.cssSelector("#remove-sauce-labs-fleece-jacket");
    private static final By removeCamisaOnesieBtn = By.cssSelector("#remove-sauce-labs-onesie");

    public void clicarNoRemoveMochilaBtn() {
        BaseTest.click(removeMochilaBtn);
    }

    public void clicarNoRemoveLampadaBtn() {
        BaseTest.click(removeLampadaBtn);
    }

    public void clicarNoRemoveCamisaCinzaBtn() {
        BaseTest.click(removeCamisaCinzaBtn);
    }

    public void clicarNoRemoveJaquetaBtn() {
        BaseTest.click(removeJaquetaBtn);
    }

    public void clicarNoRemoveCamisaOnesieBtn() {
        BaseTest.click(removeCamisaOnesieBtn);
    }

    public void clicarNoContinueShoppingBtn() {
        BaseTest.click(continueShoppingBtn);
    }

    public void clicarNoCheckoutBtn() {
        BaseTest.click(checkoutBtn);
    }



}
