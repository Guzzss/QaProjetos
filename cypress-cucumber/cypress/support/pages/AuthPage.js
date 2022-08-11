/// <reference types="cypress" />

import Utils from '../utils/Utils';
const utils = new Utils();

import AuthElement from '../elements/AuthElement';
const authElement = new AuthElement();

const Chance = require('chance')
const chance = new Chance

export default class AuthPage {

    navegar(url) {
        utils.navegar(url);
    }

   preencherEmail(){
        utils.preencherInput(authElement.emailCreate, chance.email());
   }

    clicarNoCreateBtn(){
        utils.click(authElement.createAccountBtn);
    }
}