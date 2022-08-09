import Utils from "../utils/utils";
const utils = new Utils;

import NovoUsuarioElements from "../elements/NovoUsuarioElements";
const novoUsuarioElements = new NovoUsuarioElements;

export default class NovoUsuarioPage {

  abrirNavegador() {
    utils.navegar(novoUsuarioElements.url);
  }

  preencherName() {
    utils.preencherInput(novoUsuarioElements.campoNome, "aaaaaaa");
  }

  preencherLastName() {
    utils.preencherInput(novoUsuarioElements.campoUltimoNome, "Teichmann");
  }

  preencherEmail() {
    utils.preencherInput(novoUsuarioElements.campoEmail, "gustavo@gmail.com")
  }

  preencherEnderco() {
    utils.preencherInput(novoUsuarioElements.campoEndereco, "Rua dos bobos, 0")
  }

  preencherUniversidade() {
    utils.preencherInput(novoUsuarioElements.campoUniversidade, "Universidade de São Paulo")
  }

  preencherProfissao() {
    utils.preencherInput(novoUsuarioElements.campoProfissao, "Engenheiro de Software")
  }

  preencherGenero() {
    utils.preencherInput(novoUsuarioElements.campoGenero, "Masculino")
  }

  preencherIdade() {
    utils.preencherInput(novoUsuarioElements.campoIdeade, "23")
  }

  
  clicarNoBotaoCriar() {
    utils.click(novoUsuarioElements.criarBtn);
  }

  validarCriação() {
    utils.validarText(novoUsuarioElements.criadoComSucesso, "Usuário Criado com sucesso");
  }

  validarNome() {
    utils.validarText(novoUsuarioElements.nomeCriado, "aaaaaaa");
  }

  validarUltimoNome() {
    utils.validarText(novoUsuarioElements.ultimoNomeCriado, "Teichmann");
  }

  validarEmail() {
    utils.validarText(novoUsuarioElements.emailCriado, "gustavo@gmail.com");
  }

  validarCriaçãoSemSucesso() {
    utils.validarText(novoUsuarioElements.erroMsg, "1 error proibiu que este usuário fosse salvo:");
    }
  }












//   assertSequenceChilds() {
  //   var newPath = arguments[0];
  //   for(var i = 1; i < arguments.length; i++) {
  //     cy.get(newPath + i + ')')
  //     .should('contain', arguments[i])
  //   }
  //  }