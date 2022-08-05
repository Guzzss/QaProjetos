package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class DashboardPage {

    public static final By createNewBtn = By.cssSelector("body > div > div > p:nth-child(4) > a");
    public static final By searchNameOrEmail = By.cssSelector("#searching");
    public static final By searchBtn = By.cssSelector("body > div > div > form > input.btn.btn-secondary.my-2.my-sm-0");
    public static final By editBtn = By.cssSelector("body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(7) > a.btn.btn-outline-primary");

    public static final By deleteBtn = By.cssSelector("body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(7) > a.btn.btn-outline-danger");

    public static final By welcome = By.cssSelector(" body > div > div > h3 ");


    public void clicarNoNewCliente() {
        BaseTest.click(createNewBtn);
    }

    public void preencherSearch () {
        BaseTest.sendKeys(searchNameOrEmail, "Gustavo");
    }

    public void clicarNoSearch () {
        BaseTest.click(searchBtn);
    }

    public void clicarNoEdit () {
        BaseTest.click(editBtn);
    }

    public void clicarNoDelete () {
        BaseTest.click(deleteBtn);
    }

    public String validarMsgWelcome() {
        return BaseTest.getText(welcome);
    }
}
