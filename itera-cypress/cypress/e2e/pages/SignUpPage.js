import HomePage from "./homePage";
const homePage = new HomePage();

import SignUpElements from "../elements/SignUpElements";
const signUpElements = new SignUpElements();

import Utils from "../utils/utils";
const utils = new Utils(); 

const Chance = require('chance');
const chance = new Chance();

export default class SignUpPage {
    preencherName() {
      utils.preencherInput(signUpElements.name, chance.name());
    }

    preencherLastName() {
      utils.preencherInput(signUpElements.surname, chance.last());
    }

    preencherE_post() {
      utils.preencherInput(signUpElements.E_post, chance.postcode());
    }

    preencherMobile() {
      utils.preencherInput(signUpElements.mobile, chance.phone());
    }

    preencherUsername() {
      utils.preencherInput(signUpElements.username, chance.name());
    }

    preencherComUsernameExistente() {
      utils.preencherInput(signUpElements.username, "qa");
    }

    preencherPassword() {
      utils.preencherInput(signUpElements.password, "gustavo123");
    }

    preencherConfirmPassword() {
      utils.preencherInput(signUpElements.confirmPassword, "gustavo123");
    }

    clicarNoSubmitBtn() {
      utils.click(signUpElements.submitBtn);
    }

    validarMsgSucess() {
      utils.validarText(signUpElements.msgSucess, "Registration Successful");
    }

    validarFirstNameError() {
      utils.validarText(signUpElements.firstNameError, "Please enter first name");
    }

    validarUserNameExistenteError() {
      utils.validarText(signUpElements.userNameExistenteError, "Username already exist");
    }


    }
