import DeleteElements from "../elements/DeleteElements";
const deleteElements = new DeleteElements();

import Utils from "../utils/Utils";
const utils = new Utils();

export default class {

  clicarNoDeleteBtn() {
    utils.click(deleteElements.deleteBtn);
  }
  
  validarNome() {
    utils.validarText(deleteElements.name, "QaLoko");
  }

  validarCompany() {
    utils.validarText(deleteElements.company, "Dbc");
  }

  validarAddress() {
    utils.validarText(deleteElements.address, "Rua dos Bobos");
  }

  validarCity() {
    utils.validarText(deleteElements.city, "Gravataí");
  }

  validarPhone() {
    utils.validarText(deleteElements.phone, "11 99999-9999");
  }

  validarEmail() {
    utils.validarText(deleteElements.email, "gustavo@gmail.com");
  }
}