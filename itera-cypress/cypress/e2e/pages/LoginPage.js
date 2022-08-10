import LoginElements from "../elements/LoginElements";
const loginElements = new LoginElements();

import Utils from "../utils/utils";
const utils = new Utils();

export default class LoginPage {
  navegar() {
    utils.navegar(loginElements.url);
  }

  preencherUsername() {
    utils.preencherInput(loginElements.loginUsername, "gustavoT");
  }

  preencherPassword() {
    utils.preencherInput(loginElements.loginPassword, "gustavo2302");
  }

  preencherPasswordInvalido() {
    utils.preencherInput(loginElements.loginPassword, "KKKKKKKKKKKKKKKKKKK");
  }

  clicarNoLoginBtn() {
      utils.click(loginElements.loginBtn);
  }

  msgLoginInvalido() {
    utils.validarText(loginElements.msgLoginInvalido, "Wrong username or password");
  }

  msgLoginSemPassword() {
    utils.validarText(loginElements.msgLoginSemPassword, "Please enter password");
  }

}