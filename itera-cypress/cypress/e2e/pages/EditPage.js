import EditElements from '../elements/EditElements';
const editElements = new EditElements();

import Utils from '../utils/Utils';
const utils = new Utils();

const Chance = require('chance');
const chance = new Chance();

export default class EditPage {

  preencherName() {
    utils.preencherInput(editElements.name, "QaEditado");
  }

  preencherCompany() {
    utils.preencherInput(editElements.company, chance.company());
  }

  preencherAddress() {
    utils.preencherInput(editElements.address, chance.address());
  }

  preencherCity() {
    utils.preencherInput(editElements.city, chance.city());
  }

  preencherPhone() {
    utils.preencherInput(editElements.phone, chance.phone());
  }

  preencherEmail() {
    utils.preencherInput(editElements.email, chance.email());
  }

  preencherNameVazio() {
    utils.preencherInput(editElements.name, "?");
  }

  clicarNoSaveBtn() {
    utils.click(editElements.saveBtn);
  }

  verificarNomeEditado() {
    utils.validarText(editElements.nomeEditado, "QaEditado");
  }
}