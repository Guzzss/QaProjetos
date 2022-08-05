package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.DashboardPage;
import pages.LoginPage;
import util.Browser;

public class LoginSteps extends Browser {


    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void logarComSucesso() {
        //Acessando a SignUp
        loginPage.clicarBtnLogin();

        //preencher o formulario
        loginPage.preencherUsername();
        loginPage.preencherPassword();

//        Assert.assertEquals(signUpPage.validarFirstName(), "Gustavo");


        // clicar no botão submite
        loginPage.clicarNoLogin();
        Assert.assertEquals(dashboardPage.validarMsgWelcome(), "Welcome gustavo");
    }
}
