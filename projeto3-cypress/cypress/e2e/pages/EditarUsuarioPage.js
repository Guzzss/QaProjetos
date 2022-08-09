import Utils from "../utils/utils";
const utils = new Utils;

import EditarUsuarioElements from "../elements/EditarUsuarioElements";
const editarUsuarioElements = new EditarUsuarioElements;

export default class EditarUsuarioPage {

  clicarNoEditarBtn() {
    utils.click(editarUsuarioElements.editarBtn);
  }

   preencherNome() {
    utils.preencherInput(editarUsuarioElements.novoNome, "Novo Nome");
  }

  preencherUltimoNome() {
    utils.preencherInput(editarUsuarioElements.novoLastName, "Novo Ultimo Nome");
  }

  clicarNoCriarBtn() {
    utils.click(editarUsuarioElements.criarBtn);
  }

  verificarSeFoiEditado() {
    utils.validarText(editarUsuarioElements.verificarSeFoiEditado, "Seu Usuário foi Atualizado!");
  }

  verificarSeNomeFoiEditado() {
    utils.validarText(editarUsuarioElements.nomeEditado, "Novo Nome");
  }

  verificarSeUltimoNomeFoiEditado() {
    utils.validarText(editarUsuarioElements.ultimoNomeEditado, "Novo Ultimo Nome");
  }
}