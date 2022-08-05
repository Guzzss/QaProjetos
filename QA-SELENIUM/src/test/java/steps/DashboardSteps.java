package steps;

import org.junit.Test;
import pages.CreateClientePage;
import pages.DashboardPage;
import pages.DeletePage;
import pages.EditPage;
import util.Browser;

public class DashboardSteps extends Browser {

    DashboardPage dashboardPage = new DashboardPage();
    LoginSteps loginSteps = new LoginSteps();

    EditPage editPage = new EditPage();

    CreateClientePage createClientePage = new CreateClientePage();

    DeletePage deletePage = new DeletePage();
    @Test
    public void searchComSucesso() {
        loginSteps.logarComSucesso();
        dashboardPage.preencherSearch();
        dashboardPage.clicarNoSearch();
    }
    @Test
    public void criarCliente() {
        loginSteps.logarComSucesso();
        dashboardPage.clicarNoNewCliente();
        createClientePage.preencherName();
        createClientePage.preencherCompany();
        createClientePage.preencherAddress();
        createClientePage.preencherCity();
        createClientePage.preencherPhone();
        createClientePage.preencherEmail();
        createClientePage.clicarNoCreateBtn();
    }

    @Test
    public void EditarCliente() {
        searchComSucesso();
        dashboardPage.clicarNoEdit();
        editPage.preencherNameEditado();
        editPage.preencherCompanyEditado();
        editPage.preencherAddressEditado();
        editPage.preencherCityEditado();
        editPage.preencherPhoneEditado();
        editPage.preencherEmailEditado();
        editPage.clicarNoSaveBtn();
    }

    @Test
    public void DeleteCliente() {
        searchComSucesso();
        dashboardPage.clicarNoDelete();
        deletePage.deleteBtnDefinitivo();
    }

}
