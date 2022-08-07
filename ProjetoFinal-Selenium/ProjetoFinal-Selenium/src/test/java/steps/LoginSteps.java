package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import util.Browser;

public class LoginSteps extends Browser {

    LoginPage loginPage = new LoginPage();

    @Test
    public void LoginComSucesso() {
        loginPage.preencherUsername();
        loginPage.preencherPassword();
        loginPage.clicarNoLoginBtn();
    }

    @Test
    public void LoginComCamposInvalidos() {
        loginPage.preencherComCamposInvalidos();
        loginPage.clicarNoLoginBtn();

        Assert.assertEquals(loginPage.authenticationFailedMsg(), "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void LoginSemUsername() {
        loginPage.preencherPassword();
        loginPage.clicarNoLoginBtn();

        Assert.assertEquals(loginPage.campoRequired(), "Epic sadface: Username is required");
    }

    @Test
    public void LoginSemPassword() {
        loginPage.preencherUsername();
        loginPage.clicarNoLoginBtn();

        Assert.assertEquals(loginPage.campoRequired(), "Epic sadface: Password is required");
    }

}
