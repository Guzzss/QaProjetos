package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.SignUpPage;
import util.Browser;

public class SignUpSteps extends Browser {

    SignUpPage signUpPage = new SignUpPage();

    @Test
    public void cadastrarUsuarioComSucesso() {
        //Acessando a SignUp
        signUpPage.clicarBtnSignUp();

        //preencher o formulario
        signUpPage.preencherFirstName();
        signUpPage.preencherSurname();
        signUpPage.preencherEpost();
        signUpPage.preencherMobile();
        signUpPage.preencherUsername();
        signUpPage.preencherPassword();
        signUpPage.preencherConfirmPassword();

//        Assert.assertEquals(signUpPage.validarFirstName(), "Gustavo");


        // clicar no botão submite
        signUpPage.clicarNoSubmite();

//        Assert.assertEquals(signUpPage.validarMsg(), "Registration Successful");
    }


}
