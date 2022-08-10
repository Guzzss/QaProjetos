
import HomeElement from "../elements/HomeElements";
const homeElement = new HomeElement();

import Utils from "../utils/utils";
const utils = new Utils;

export default class HomePage {
  
  navegar(url) {
    utils.navegar(homeElement.url);
  }

  clicarNoSignUpBtn() {
    utils.click(homeElement.signUpBtn);
}

  clicarNoLoginBtn() {
    utils.click(homeElement.loginBtn);
  }
}