package steps;

import org.junit.Test;
import pages.LogedPage;
import util.BaseTest;
import util.Browser;

public class LogedStep extends Browser {
    LogedPage logedPage = new LogedPage();
    CreateAccountStep createAccountStep = new CreateAccountStep();

    @Test
    public void search() {
        logedPage.search();
        logedPage.clicarNoSearch();
    }

    @Test
    public void clicarNoWhiteList(){
        logedPage.ClicarNoWhiteList();
    };

    public void ClicarNoVoltarPraLogedPage() {
        logedPage.ClicarNoVoltarPraLogedPage();
    }
}
