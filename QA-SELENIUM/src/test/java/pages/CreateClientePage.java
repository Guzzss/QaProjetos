package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class CreateClientePage {

    DashboardPage dashboardPage = new DashboardPage();

    public static final By name = By.cssSelector("#Name");
    public static final By company = By.cssSelector("#Company");
    public static final By address = By.cssSelector("#Address");
    public static final By city = By.cssSelector("#City");
    public static final By phone = By.cssSelector("#Phone");
    public static final By email = By.cssSelector("#Email");
    public static final By createBtn = By.cssSelector("body > div > form > div > div:nth-child(9) > div > input");

    public void preencherName() {
            BaseTest.sendKeys(name, "Gustavo");
    }
    public void preencherCompany() {
        BaseTest.sendKeys(company, "DBC COMPANY");
    }
    public void preencherAddress() {
        BaseTest.sendKeys(address, "Brasil");
    }
    public void preencherCity() {
        BaseTest.sendKeys(city, "Brasil");
    }
    public void preencherPhone() {
        BaseTest.sendKeys(phone, "05198986051");
    }
    public void preencherEmail() {
        BaseTest.sendKeys(email, "gustavo@gmail.com");
    }
    public void clicarNoCreateBtn() {BaseTest.click(createBtn);}


}
