package steps;

import org.junit.Test;
import pages.AccountPage;
import util.Browser;

public class AccountStep extends Browser {

    AccountPage accountPage = new AccountPage();
    HomePageSteps homePageSteps = new HomePageSteps();

    @Test
    public void criarEmail() {
        homePageSteps.signIn();
        accountPage.criarEmail();
        accountPage.clicarNoCreateBtn();
    }
}
