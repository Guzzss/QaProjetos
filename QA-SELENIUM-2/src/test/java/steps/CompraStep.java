package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.CompraPage;
import pages.SearchPage;
import util.Browser;

public class CompraStep extends Browser {

    CompraPage compraPage = new CompraPage();
    SearchStep searchStep = new SearchStep();

    @Test
    public void comprar() {
        searchStep.add();
        compraPage.continuarCompra2();
        compraPage.addComentario();
        compraPage.continuarCompra3();
        compraPage.clicarNoTermosBtn();
        compraPage.continuarCompra4();
        compraPage.addMetodoPagamento();
        compraPage.confirmarCompra();
    }
}
