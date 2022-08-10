import DashboardElements from "../elements/DashboardElements";
const dashboardElements = new DashboardElements();

import Utils from "../utils/Utils";
const utils = new Utils();

export default class DashboardPage {

  clicarNoCreateBtn() {
    utils.click(dashboardElements.createNewBtn);
  }

  pesquisar() {
    utils.preencherInput(dashboardElements.searchInput, "Qa");
  }

  pesquisarNomeDiferente() {
    utils.preencherInput(dashboardElements.searchInput, "QaLoko");
  }

  pesquisarPeloEmail() {
    utils.preencherInput(dashboardElements.searchInput, "gustavo@gmail.com");
  }

  pesquisarClienteInexistente() {
    utils.preencherInput(dashboardElements.searchInput, "!");
  }

  clicarNoSearchBtn() {
    utils.click(dashboardElements.searchBtn);
  }

  clicarNoEditBtn() {
    utils.click(dashboardElements.editBtn);
  }

  clicarNoDeleteBtm() {
    utils.click(dashboardElements.deleteBtn);
  }

  validarSeEstaLogado() {
    utils.validarText(dashboardElements.welcomeMsg, "Welcome gustavoT");
  }

  validarNomePesquisado() {
    utils.validarText(dashboardElements.nomePesquisado, "Qa");
  }

  validarEmailPesquisado() {
    utils.validarText(dashboardElements.EmailPesquisado, "gustavo@gmail.com")
  }

  validarNoMatch() {
    utils.validarText(dashboardElements.noMatch, "No Match");
  }


}