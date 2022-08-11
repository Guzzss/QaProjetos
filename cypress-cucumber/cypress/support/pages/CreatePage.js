/// <reference types="cypress" />

import Utils from '../utils/Utils';
const utils = new Utils();

const Chance = require('chance')
const chance = new Chance

import CreateElement from '../elements/CreateElement';
const createElement = new CreateElement();

let password = "gustavo123"
export default class CreatePage {

  clicarNoMrBtn() {
    utils.click(createElement.MrBtn);
  }

  preencherFirstName() {
    utils.preencherInput(createElement.firstName, chance.name());
  }

  preencherLastName() {
    utils.preencherInput(createElement.lastName, chance.name());
  }

  preencherPassword() {
    utils.preencherInput(createElement.password, password);
  }

  clicarNoDia() {
    utils.select(createElement.dia, '1');
  }

  clicarNoMes() {
    utils.select(createElement.mes, 'January');
  }

  clicarNoAno() {
    utils.select(createElement.ano, '2010');
  }

  preencherFirstNameAddress() {
    utils.preencherInput(createElement.firsNameAddress, 'teste');
  }

  preencherLastNameAddress() {
    utils.preencherInput(createElement.lastNameAddress,'teste');
  }

  preencherCompany() {
    utils.preencherInput(createElement.company, chance.company());
  }

  prencherAddress() {
    utils.preencherInput(createElement.Address, chance.address());
  }

  preencherCity() {
    utils.preencherInput(createElement.city, chance.city());
  }

  clicarNoState() {
    utils.select(createElement.state, "1");
    // utils.tempo(5000);
  }

  preencherPostalCode() {
    utils.preencherInput(createElement.postalCode, chance.zip());
  }

  clicarNoCountry() {
    utils.select(createElement.country, '21');
  }

  preencherMobilePhone() {
    utils.preencherInput(createElement.mobilePhone, chance.phone());
  }

  preencherReference() {
    utils.preencherInput(createElement.reference, chance.word());
  }

  clicarNoRegisterBtn() {
    utils.click(createElement.registerBtn);
  }

  verificarPasswordMsg() {
    utils.validarText(createElement.passwordMsg, "passwd is required.");
  }

  }

