import CreatePage from "../pages/CreatePage";
const createPage = new CreatePage();

import DashboardPage from "../pages/DashboardPage";
const dashboardPage = new DashboardPage();

import LoginPage from "../pages/LoginPage";
const loginPage = new LoginPage();


context("Criar novo usuário", () => {
  it('Criar novo usuário com sucesso', () => {
    loginPage.navegar();
    loginPage.preencherUsername();
    loginPage.preencherPassword();
    loginPage.clicarNoLoginBtn();
    dashboardPage.clicarNoCreateBtn();
    createPage.preencherName()
    createPage.preencherCompany()
    createPage.preencherAddress()
    createPage.preencherCity()
    createPage.preencherPhone()
    createPage.preencherEmail()
    createPage.clicarNoCreateBtn()
  })  

  // it('Criar novo usuário sem sucesso', () => {
  //   loginPage.navegar();
  //   loginPage.preencherUsername();
  //   loginPage.preencherPassword();
  //   loginPage.clicarNoLoginBtn();
  //   dashboardPage.clicarNoCreateBtn();
  //   createPage.preencherName()
  //   createPage.preencherCompany()
  //   createPage.preencherAddress()
  //   createPage.preencherCity()
  //   createPage.preencherPhone()
  //   createPage.preencherEmail()
  //   createPage.clicarNoCreateBtn()

  // })  

})
