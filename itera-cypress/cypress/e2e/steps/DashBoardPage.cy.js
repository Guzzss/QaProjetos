import DashboardPage from "../pages/DashboardPage";
const dashboardPage = new DashboardPage();

import LoginPage from "../pages/LoginPage";
const loginPage = new LoginPage();

context("Dashboard pesquisa", () => {
  it('listar clientes com sucesso', () => {
    loginPage.navegar();
    loginPage.preencherUsername();
    loginPage.preencherPassword();
    loginPage.clicarNoLoginBtn();
    dashboardPage.pesquisar();
    dashboardPage.clicarNoSearchBtn();
    dashboardPage.validarNomePesquisado();
  })

  it('listar clientes pelo email com sucesso', () => {
    loginPage.navegar();
    loginPage.preencherUsername();
    loginPage.preencherPassword();
    loginPage.clicarNoLoginBtn();
    dashboardPage.pesquisarPeloEmail();
    dashboardPage.clicarNoSearchBtn();
    dashboardPage.validarEmailPesquisado();
  })

  it('listar clientes sem sucesso', () => {
    loginPage.navegar();
    loginPage.preencherUsername();
    loginPage.preencherPassword();
    loginPage.clicarNoLoginBtn();
    dashboardPage.pesquisarClienteInexistente();
    dashboardPage.clicarNoSearchBtn();
    dashboardPage.validarNoMatch();
  })

})  