/// <reference types="cypress" />

import LoggedPage from "../pages/LoggedPage";
const loggedPage = new LoggedPage;

Then("devo verificar se esta logado", () => {
   loggedPage.validarSeEstaLogado();
});