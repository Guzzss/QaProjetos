import ListaUsuarioPage from '../pages/ListaUsuarioPage';  
const listaUsuarioPage = new ListaUsuarioPage;

import Utils from "../utils/utils";
const utils = new Utils;

context("Visualizar usuário com sucesso", () => {
  // it('passes', () => {
  //     listaUsuarioPage.abrirNavegador();
  //     listaUsuarioPage.clicarNoEditarBtn();
  // })

  it('ver usuario', () => {
    listaUsuarioPage.abrirNavegador();
    utils.telaCheia();
    listaUsuarioPage.clicarNoVerUsuarioBtn();
})
//   it('excluir usuario', () => {
//     listaUsuarioPage.abrirNavegador();
//     // utils.telaCheia();
//     listaUsuarioPage.clicarNoExcluirBtn();
//     cy.on('window:confirm', (str) => {  // eslint-disable-line no-unused-vars
//       return true;
//     }).click();
// })
  

})



