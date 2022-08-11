import AuthPage from "../pages/AuthPage";
const authPage = new AuthPage;

import CreatePage from "../pages/CreatePage";
const createPage = new CreatePage;

import Utils from "../utils/utils";
const utils = new Utils;

Given("que acesso o respectivo sistema {}", (url) => {
  authPage.navegar(url);
  authPage.preencherEmail();
  authPage.clicarNoCreateBtn();
  utils.tempo(10000);

});

And("clico no Mr.", () => {
  createPage.clicarNoMrBtn();
});

And("preencho o campo first Name", () => {
  createPage.preencherFirstName();
});

And("preencho o campo last Name", () => {
  createPage.preencherLastName();

});

And("preencho o campo password", () => {
  createPage.preencherPassword();
});

And("seleciono o respectivo dia", () => {
  createPage.clicarNoDia();
});

And("seleciono o respectivo mes", () => {
  createPage.clicarNoMes();

});

And("seleciono o respectivo ano", () => {
  createPage.clicarNoAno();
});

And("preencho o campo first Name Address", () => {
  createPage.preencherFirstNameAddress();
});

And("preencho o campo last Name Address", () => {
  createPage.preencherLastNameAddress();
});

And("preencho o campo company", () => {
  createPage.preencherCompany();
});

And("preencho o campo Address", () => {
  createPage.prencherAddress();
});

And("preencho o campo City", () => {
  createPage.preencherCity();
});

And("clico no respectivo country", () => {
  createPage.clicarNoCountry();

});

And("preencho o campo postal code", () => {
  createPage.preencherPostalCode();
});


And("clico no respectivo estado", () => {
  createPage.clicarNoState();
});

And("preencho o campo mobile phone", () => {
  createPage.preencherMobilePhone();

});

And("preencho o campo reference", () => {
  createPage.preencherReference();

});

When("clico no botao register", () => {
  createPage.clicarNoRegisterBtn();

}); 

Then("devo verificar mensagem de quando o campo password esta vazio", () => {
  createPage.verificarPasswordMsg();
});



