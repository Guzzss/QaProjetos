import EditarUsuarioPage from "../pages/EditarUsuarioPage";
const editarUsuarioPage = new EditarUsuarioPage;

import ListaUsuarioPage from '../pages/ListaUsuarioPage';  
const listaUsuarioPage = new ListaUsuarioPage;

import Utils from "../utils/utils";
const utils = new Utils;

context("Editar Usuario com sucesso", () => {
  it('editar usuario com sucesso', () => {
    listaUsuarioPage.abrirNavegador();
    listaUsuarioPage.clicarNoEditarBtn();
    editarUsuarioPage.preencherNome();
    editarUsuarioPage.preencherUltimoNome();
    editarUsuarioPage.clicarNoCriarBtn();
    editarUsuarioPage.verificarSeFoiEditado();
    editarUsuarioPage.verificarSeNomeFoiEditado();
    editarUsuarioPage.verificarSeUltimoNomeFoiEditado();

  })

  // it('passes', () => {
  //   listaUsuarioPage.abrirNavegador();
  //   listaUsuarioPage.clicarNoEditarBtn();
  //   // editarUsuarioPage.clicarNoEditarBtn();
  //   editarUsuarioPage.preencherNome();
  //   editarUsuarioPage.preencherUltimoNome();
  //   editarUsuarioPage.clicarNoCriarBtn();
  //   editarUsuarioPage.verificarSeFoiEditado();
   
  // })
})