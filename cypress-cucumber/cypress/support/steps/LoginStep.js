import LoginPage from "../pages/LoginPage";
const loginPage = new LoginPage;

Given("que acesso o sistema {}", (site) => {
   loginPage.navegar(site);

});

And("preencho com username {}", (username) => {
   loginPage.preencherUsername(username)

});

And("preencho com senha {}", (password) => {
   loginPage.preencherPassword(password)

});

When("clico botao login", () => {
   loginPage.clicarNoLoginBtn();

});

Then("devo verificar uma mensagem {}", () => {
  return null;
});