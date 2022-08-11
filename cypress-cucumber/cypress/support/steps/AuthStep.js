import AuthPage from "../pages/AuthPage";
const authPage = new AuthPage;

Given("que acesso o sistema {}", (site) => {
  authPage.navegar(site);

});

And("preencho com o email {}", () => {
  authPage.preencherEmail();

});


When("clico no botao create an account", () => {
  authPage.clicarNoCreateBtn();

});

Then("devo verificar uma mensagem {}", () => {
  return null;
});