import CreateElements from "../elements/CreateElemente";
const createElements = new CreateElements();

import Utils from "../utils/Utils";
const utils = new Utils();

const Chance = require('chance');
const chance = new Chance();

export default class CreatePage {

  navegar() {
    cy.visit(createElements.url)
  }
  preencherName() {
    utils.preencherInput(createElements.name, "Qa");
  }

  preencherNameDiferente() {
    utils.preencherInput(createElements.name, "QaLoko");
  }

  preencherCompany() {
    utils.preencherInput(createElements.company, "Dbc");
  }

  preencherAddress() {
    utils.preencherInput(createElements.address, "Rua dos Bobos");
  }

  preencherCity() {
    utils.preencherInput(createElements.city, "Gravataí");
  }

  preencherPhone() {
    utils.preencherInput(createElements.phone, "11 99999-9999");
  }

  preencherEmail() {
    utils.preencherInput(createElements.email, "gustavo@gmail.com");
  }

  clicarNoCreateBtn() {
    utils.click(createElements.createBtn);
  }


 }