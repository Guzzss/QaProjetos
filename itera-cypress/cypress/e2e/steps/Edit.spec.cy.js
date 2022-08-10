import DashboardPage from "../pages/DashboardPage";
const dashboardPage = new DashboardPage();

import EditPage from "../pages/EditPage";
const editPage = new EditPage();

import CreatePage from "../pages/CreatePage";
const createPage = new CreatePage();

import LoginPage from "../pages/LoginPage";
const loginPage = new LoginPage();

context("Editar usuário", () => {
  it('Editar usuário com sucesso', () => {
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

    dashboardPage.pesquisar();
    dashboardPage.clicarNoSearchBtn();
    dashboardPage.clicarNoEditBtn();

    editPage.preencherName()
    editPage.preencherCompany()
    editPage.preencherAddress()
    editPage.preencherCity()
    editPage.preencherPhone()
    editPage.preencherEmail()
    editPage.clicarNoSaveBtn()

    dashboardPage.pesquisar();
    dashboardPage.clicarNoSearchBtn();
    editPage.verificarNomeEditado();
  })  

  // it('Editar usuário com sucesso', () => {
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

  //   dashboardPage.pesquisar();
  //   dashboardPage.clicarNoSearchBtn();
  //   dashboardPage.clicarNoEditBtn();

  //   editPage.preencherNameVazio()
  //   editPage.preencherCompany()
  //   editPage.preencherAddress()
  //   editPage.preencherCity()
  //   editPage.preencherPhone()
  //   editPage.preencherEmail()
  //   editPage.clicarNoSaveBtn()
    
  // })  
})

