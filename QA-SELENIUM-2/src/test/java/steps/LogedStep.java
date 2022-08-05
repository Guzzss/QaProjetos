package steps;

import org.junit.Test;
import pages.LogedPage;
import util.Browser;

public class LogedStep extends Browser {
    LogedPage logedPage = new LogedPage();
    CreateAccountStep createAccountStep = new CreateAccountStep();

    @Test
    public void search() {
        createAccountStep.criarrConta();
        logedPage.search();
        logedPage.clicarNoSearch();
    }
}
