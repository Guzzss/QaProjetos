package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.CompraPage;
import pages.SearchPage;
import util.BaseTest;
import util.Browser;

import java.util.concurrent.TimeUnit;

public class SearchStep extends Browser {

    LogedStep logedStep = new LogedStep();
    SearchPage searchPage = new SearchPage();

    CompraPage compraPage = new CompraPage();

    CreateAccountStep createAccountStep = new CreateAccountStep();
    @Test
    public void add() {
        createAccountStep.criarrConta();
        logedStep.search();
        searchPage.addAoCarrinho();
        BaseTest.esperar(15);
        searchPage.proximaPaginaCompra();

        Assert.assertEquals(compraPage.nomeRoupa(), "Printed Summer Dress");
    }
}
