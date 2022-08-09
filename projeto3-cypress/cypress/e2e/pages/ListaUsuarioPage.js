import Utils from "../utils/utils";
const utils = new Utils;

import ListaDeUsuariosElements from "../elements/ListaDeUsuariosElements";
const listaDeUsuariosElements = new ListaDeUsuariosElements;


export default class NovoUsuarioPage {

  abrirNavegador() {
    utils.navegar(listaDeUsuariosElements.url);
  }

  clicarNoEditarBtn() {
    utils.clickForce(listaDeUsuariosElements.editarUsuarioBtn);
  }

  clicarNoExcluirBtn() {
    utils.click(listaDeUsuariosElements.excluirUsuarioBtn);
  }

  clicarNoVerUsuarioBtn() {
    utils.click(listaDeUsuariosElements.verUsuarioBtn);
  }
}