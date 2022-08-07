package steps;

import org.junit.Test;
import pages.HomePage;
import util.Browser;

public class HomeSteps extends Browser {

    HomePage homePage = new HomePage();
    LoginSteps loginSteps = new LoginSteps();

    @Test
    public void addItensToCart () {
       homePage.clicarNoAddMochilhaToCardBtn();
       homePage.clicarNoAddLampadaToCardBtn();
       homePage.clicarNoAddTshirtCinzaToCardBtn();
       homePage.clicarNoAddJaquetaToCardBtn();
       homePage.clicarNoAddCamisaOnesieToCardBtn();
       homePage.clicarNoCartBtn();
    }

}

