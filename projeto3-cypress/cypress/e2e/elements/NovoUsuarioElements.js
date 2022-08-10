export default class NovoUsuarioElements {

  url = 'https://automacaocombatista.herokuapp.com/users/new';
  campoNome = "#user_name";
  campoUltimoNome = "#user_lastname";
  campoEmail = "#user_email";
  campoEndereco = "#user_address";
  campoUniversidade = "#user_university";
  campoProfissao = "#user_profile";
  campoGenero = "#user_gender";
  campoIdeade = "#user_age";
  criarBtn = "#new_user > div:nth-child(7) > div > div > input[type=submit]";
  criadoComSucesso = "#notice";

  nomeCriado = "body > div.row > div.col.s9 > div:nth-child(3) > div > p:nth-child(1)";
  ultimoNomeCriado = "body > div.row > div.col.s9 > div:nth-child(3) > div > p:nth-child(2)";
  emailCriado = "body > div.row > div.col.s9 > div:nth-child(3) > div > p:nth-child(3)";

  erroMsg = '#error_explanation > h2';
} 