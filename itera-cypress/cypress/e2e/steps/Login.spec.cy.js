import LoginPage from "../pages/LoginPage";
const loginPage = new LoginPage();

import DashboardPage from "../pages/DashboardPage";
const dashboardPage = new DashboardPage();

describe("Login", () => {
  it ("Login com sucesso", () => {
    loginPage.navegar();
    loginPage.preencherUsername();
    loginPage.preencherPassword();
    loginPage.clicarNoLoginBtn();
    dashboardPage.validarSeEstaLogado();
  })

  it ("Login sem sucesso", () => {
    loginPage.navegar();
    loginPage.preencherUsername();
    loginPage.preencherPasswordInvalido();
    loginPage.clicarNoLoginBtn();
    loginPage.msgLoginInvalido();
  })

  it ("Login sem password", () => {
    loginPage.navegar();
    loginPage.preencherUsername();
    loginPage.clicarNoLoginBtn();
    loginPage.msgLoginSemPassword();
  })
})

