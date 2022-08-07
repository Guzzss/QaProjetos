package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class CheckoutPage {

    private static final By firstName = By.cssSelector("#first-name");
    private static final By lastName = By.cssSelector("#last-name");
    private static final By postalCode = By.cssSelector("#postal-code");
    private static final By continueBtn = By.cssSelector("#continue");
    private static final By finishBtn = By.cssSelector("#finish");

    private static final By campoIsRequired = By.cssSelector("#checkout_info_container > div > form > div.checkout_info > div.error-message-container.error > h3");
    private static final By precoTotal = By.cssSelector("#checkout_summary_container > div > div.summary_info > div.summary_total_label");
    private static final By checkoutCompleteMsg = By.cssSelector("#header_container > div.header_secondary_container > span");
    private static final By ThankYouMsg = By.cssSelector("#checkout_complete_container > h2");

    public void preencherFirstName() {
        BaseTest.sendKeys(firstName, "Gustavo");
    }

    public void preencherLastName() {
        BaseTest.sendKeys(lastName, "Silva");
    }
    public void preencherPostalCode() {
        BaseTest.sendKeys(postalCode, "12345");
    }

    public void clicarNoContinueBtn() {
        BaseTest.click(continueBtn);
    }

    public String verificarCampoIsRequired() {
        return BaseTest.getText(campoIsRequired);
    }

    public void clicarNoFinishBtn() {
        BaseTest.click(finishBtn);
    }

    public String verificarPrecoTotal() {
        return BaseTest.getText(precoTotal);
    }
    public String verificarCheckoutCompleteMsg() {
        return BaseTest.getText(checkoutCompleteMsg);
    }

    public String verificarThankYouMsg() {
        return BaseTest.getText(ThankYouMsg);
    }
}
