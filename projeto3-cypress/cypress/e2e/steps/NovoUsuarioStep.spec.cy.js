import NovoUsuarioPage from "../pages/NovoUsuarioPage";
const novoUsuarioPage = new NovoUsuarioPage;

import Utils from "../utils/utils";
const utils = new Utils;

context("Criar novo usuário com sucesso", () => {
  it('passes', () => {
    novoUsuarioPage.abrirNavegador();
    novoUsuarioPage.preencherName();
    novoUsuarioPage.preencherLastName();
    novoUsuarioPage.preencherEmail();
    novoUsuarioPage.preencherEnderco();
    novoUsuarioPage.preencherUniversidade();
    novoUsuarioPage.preencherProfissao();
    novoUsuarioPage.preencherGenero();
    novoUsuarioPage.preencherIdade();
    novoUsuarioPage.clicarNoBotaoCriar();
    novoUsuarioPage.validarCriação();
    novoUsuarioPage.validarNome();
    novoUsuarioPage.validarUltimoNome();
    novoUsuarioPage.validarEmail();
  })

  // it('Criar novo usuário sem sucesso', () => {
  //   novoUsuarioPage.abrirNavegador();
  //   novoUsuarioPage.preencherLastName();
  //   novoUsuarioPage.preencherEmail();
  //   novoUsuarioPage.preencherEnderco();
  //   novoUsuarioPage.preencherUniversidade();
  //   novoUsuarioPage.preencherProfissao();
  //   novoUsuarioPage.preencherGenero();
  //   novoUsuarioPage.preencherIdade();
  //   novoUsuarioPage.clicarNoBotaoCriar();
  //   novoUsuarioPage.validarCriação();
  //   novoUsuarioPage.validarCriaçãoSemSucesso();
  // })
})



