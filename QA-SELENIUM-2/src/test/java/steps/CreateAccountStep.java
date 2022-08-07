package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.CreateAccountPage;
import pages.LogedPage;
import util.Browser;

public class CreateAccountStep extends Browser {
    HomePageSteps homePageSteps = new HomePageSteps();
    AccountStep accountStep = new AccountStep();
    CreateAccountPage createAccountPage = new CreateAccountPage();

    LogedPage logedPage = new LogedPage();
    @Test
    public void criarrConta() {
        homePageSteps.signIn();
        accountStep.criarEmail();
        createAccountPage.clicarNoMrBtn();
        createAccountPage.firsName();
        createAccountPage.lastName();
        createAccountPage.password();
        createAccountPage.days();
        createAccountPage.months();
        createAccountPage.years();
        createAccountPage.newsletter();
        createAccountPage.optin();
        createAccountPage.firstnameAddress();
        createAccountPage.lastnameAddres();
        createAccountPage.company();
        createAccountPage.addrees();
        createAccountPage.addrees2();
        createAccountPage.city();
        createAccountPage.state();
        createAccountPage.postCode();
        createAccountPage.idCountry();
        createAccountPage.other();
        createAccountPage.phoneMobile();
        createAccountPage.alias();
        createAccountPage.submitAccountBtn();

        Assert.assertEquals(logedPage.verificarUserLogado(), "Gustavo Teichmann");
        Assert.assertEquals(logedPage.verificarLogado(), "Sign out");

    }
}
