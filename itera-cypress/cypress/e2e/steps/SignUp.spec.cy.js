import HomePage from "../pages/homePage";
const homePage = new HomePage();

import SignUpPage from "../pages/SignUpPage";
const signUpPage = new SignUpPage();

context("Criar novo usuário", () => {
  it('Criar novo usuário com sucesso', () => {
    homePage.navegar();
    homePage.clicarNoSignUpBtn();
    signUpPage.preencherName();
    signUpPage.preencherLastName();
    signUpPage.preencherE_post();
    signUpPage.preencherMobile();
    signUpPage.preencherUsername();
    signUpPage.preencherPassword();
    signUpPage.preencherConfirmPassword();
    signUpPage.clicarNoSubmitBtn();
    signUpPage.validarMsgSucess();
  })

  it('Criar novo usuário sem passar o nome', () => {
    homePage.navegar();
    homePage.clicarNoSignUpBtn();
    signUpPage.preencherLastName();
    signUpPage.preencherE_post();
    signUpPage.preencherMobile();
    signUpPage.preencherUsername();
    signUpPage.preencherPassword();
    signUpPage.preencherConfirmPassword();
    signUpPage.clicarNoSubmitBtn();
    signUpPage.validarFirstNameError();
  })

  it('Criar novo usuário com nome existente', () => {
    homePage.navegar();
    homePage.clicarNoSignUpBtn();
    signUpPage.preencherName();
    signUpPage.preencherLastName();
    signUpPage.preencherE_post();
    signUpPage.preencherMobile();
    signUpPage.preencherComUsernameExistente();
    signUpPage.preencherPassword();
    signUpPage.preencherConfirmPassword();
    signUpPage.clicarNoSubmitBtn();
    signUpPage.validarUserNameExistenteError();
  })

 
})