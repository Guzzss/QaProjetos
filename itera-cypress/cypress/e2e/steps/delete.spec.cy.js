import DeletePage from "../pages/DeletePage";
const deletePage = new DeletePage();

import DashboardPage from "../pages/DashboardPage";
const dashboardPage = new DashboardPage();

import LoginPage from "../pages/LoginPage";
const loginPage = new LoginPage();

import CreatePage from "../pages/CreatePage";
const createPage = new CreatePage();

context("Deletar usuário", () => {
  it('Deletar usuário com sucesso', () => {
    loginPage.navegar()
    loginPage.preencherUsername()
    loginPage.preencherPassword()
    loginPage.clicarNoLoginBtn()

    dashboardPage.clicarNoCreateBtn();
    createPage.preencherNameDiferente()
    createPage.preencherCompany()
    createPage.preencherAddress()
    createPage.preencherCity()
    createPage.preencherPhone()
    createPage.preencherEmail()
    createPage.clicarNoCreateBtn()


    dashboardPage.pesquisarNomeDiferente();
    dashboardPage.clicarNoSearchBtn();
    dashboardPage.clicarNoDeleteBtm();

    deletePage.validarNome();
    deletePage.validarCompany();
    deletePage.validarAddress();
    deletePage.validarCity();
    deletePage.validarPhone();
    deletePage.validarEmail();
    deletePage.clicarNoDeleteBtn();


  })  


})

