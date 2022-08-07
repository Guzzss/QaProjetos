package steps;

import org.junit.Test;
import pages.HomePage;
import util.Browser;

public class HomePageSteps extends Browser {

    HomePage homePage = new HomePage();

    @Test
    public void signIn () {
        homePage.clicarNoSignInBtn();
    }
}
