package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.CartPage;
import pages.CheckoutPage;
import util.Browser;

public class CheckoutSteps extends Browser {

    HomeSteps homeSteps = new HomeSteps();

    CartPage cartPage = new CartPage();
    LoginSteps loginSteps = new LoginSteps();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void comprarComSucesso() {
        loginSteps.LoginComSucesso();
        homeSteps.addItensToCart();
        cartPage.clicarNoCheckoutBtn();
        checkoutPage.preencherFirstName();
        checkoutPage.preencherLastName();
        checkoutPage.preencherPostalCode();
        checkoutPage.clicarNoContinueBtn();
        checkoutPage.clicarNoFinishBtn();

        Assert.assertEquals(checkoutPage.verificarCheckoutCompleteMsg(), "CHECKOUT: COMPLETE!");
        Assert.assertEquals(checkoutPage.verificarThankYouMsg(), "THANK YOU FOR YOUR ORDER");
    }

    @Test
    public void comprarSemPreencherFirstName() {
        loginSteps.LoginComSucesso();
        homeSteps.addItensToCart();
        cartPage.clicarNoCheckoutBtn();
        checkoutPage.preencherLastName();
        checkoutPage.preencherPostalCode();
        checkoutPage.clicarNoContinueBtn();

        Assert.assertEquals(checkoutPage.verificarCampoIsRequired(), "Error: First Name is required");
    }

    @Test
    public void comprarSemPreencherLastName() {
        loginSteps.LoginComSucesso();
        homeSteps.addItensToCart();
        cartPage.clicarNoCheckoutBtn();
        checkoutPage.preencherFirstName();
        checkoutPage.preencherPostalCode();
        checkoutPage.clicarNoContinueBtn();

        Assert.assertEquals(checkoutPage.verificarCampoIsRequired(), "Error: Last Name is required");
    }

    @Test
    public void comprarSemPreencherPostalCode() {
        loginSteps.LoginComSucesso();
        homeSteps.addItensToCart();
        cartPage.clicarNoCheckoutBtn();
        checkoutPage.preencherFirstName();
        checkoutPage.preencherLastName();
        checkoutPage.clicarNoContinueBtn();

        Assert.assertEquals(checkoutPage.verificarCampoIsRequired(), "Error: Postal Code is required");
    }

    @Test
    public void verificarPrecoTotal() {
        loginSteps.LoginComSucesso();
        homeSteps.addItensToCart();
        cartPage.clicarNoCheckoutBtn();
        checkoutPage.preencherFirstName();
        checkoutPage.preencherLastName();
        checkoutPage.preencherPostalCode();
        checkoutPage.clicarNoContinueBtn();

        Assert.assertEquals(checkoutPage.verificarPrecoTotal(), "Total: $123.07");
    }

}
