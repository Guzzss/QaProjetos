package steps;

import org.junit.Test;
import pages.SearchPage;
import util.Browser;

public class SearchStep extends Browser {

    LogedStep logedStep = new LogedStep();
    SearchPage searchPage = new SearchPage();

    @Test
    public void add() {
        logedStep.search();
        searchPage.addAoCarrinho();
        searchPage.setContinuarComprando();
    }
}
