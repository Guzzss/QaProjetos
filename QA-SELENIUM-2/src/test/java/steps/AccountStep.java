package steps;

import org.junit.Assert;
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

    @Test
    public void signIn() {
        homePageSteps.signIn();
        accountPage.preencherEmail();
        accountPage.preencherSenha();
        accountPage.clicarNoSignIn();
    }

    @Test
    public void signInComEmailInvalido() {
        homePageSteps.signIn();
        accountPage.preencherEmailInvalido();
        accountPage.preencherSenha();
        accountPage.clicarNoSignIn();
        Assert.assertEquals(accountPage.RecuperarMensagem(), "Authentication failed.");
    }

    @Test
    public void signInSemEmail() {
        homePageSteps.signIn();
        accountPage.preencherSenha();
        accountPage.clicarNoSignIn();
        Assert.assertEquals(accountPage.RecuperarMensagem(), "An email address required.");
    }

    @Test
    public void signInSemSenha() {
        homePageSteps.signIn();
        accountPage.preencherEmail();
        accountPage.clicarNoSignIn();
        Assert.assertEquals(accountPage.RecuperarMensagem(), "Password is required.");
    }
}

