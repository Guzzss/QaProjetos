package steps;

import org.junit.Test;
import pages.CardPage;
import pages.LogedPage;
import pages.WhitListPage;
import util.BaseTest;
import util.Browser;

import java.util.concurrent.TimeUnit;

public class WhitListStep extends Browser {

    WhitListPage whitListPage = new WhitListPage();
    AccountStep accountStep = new AccountStep();
    LogedStep logedStep = new LogedStep();
    
    CardPage cardPage= new CardPage();

    @Test
    public void criarWhitList() {
        accountStep.signIn();
        logedStep.clicarNoWhiteList();
        whitListPage.preencheWhitListName();
        whitListPage.clicarNoSave();
        BaseTest.esperar(15);
        whitListPage.clicarNoCard();
        cardPage.clicarNoAddToWhitList();
        cardPage.clicarNoFecharMensagem();
        logedStep.ClicarNoVoltarPraLogedPage();
        logedStep.clicarNoWhiteList();
    }
}
