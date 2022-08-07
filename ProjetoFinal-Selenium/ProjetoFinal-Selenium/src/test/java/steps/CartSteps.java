package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.CartPage;
import pages.HomePage;
import util.Browser;

public class CartSteps extends Browser {

    CartPage cartPage = new CartPage();
    HomeSteps homeSteps = new HomeSteps();
    LoginSteps loginSteps = new LoginSteps();
    HomePage homePage = new HomePage();

    @Test
    public void removerItensDoCarrinho() {
        loginSteps.LoginComSucesso();
        homeSteps.addItensToCart();
        cartPage.clicarNoRemoveMochilaBtn();
        cartPage.clicarNoRemoveLampadaBtn();
        cartPage.clicarNoRemoveCamisaCinzaBtn();
        cartPage.clicarNoRemoveJaquetaBtn();
        cartPage.clicarNoRemoveCamisaOnesieBtn();
        cartPage.clicarNoContinueShoppingBtn();

        Assert.assertEquals(homePage.verificarAddToCardMsgToMochila(), "ADD TO CART");
        Assert.assertEquals(homePage.verificarAddToCardMsgToLampada(), "ADD TO CART");
        Assert.assertEquals(homePage.verificarAddToCardMsgToTshirtCinza(), "ADD TO CART");
        Assert.assertEquals(homePage.verificarAddToCardMsgToJaqueta(), "ADD TO CART");
        Assert.assertEquals(homePage.verificarAddToCardMsgToCamisaOnesie(), "ADD TO CART");
    }


}
