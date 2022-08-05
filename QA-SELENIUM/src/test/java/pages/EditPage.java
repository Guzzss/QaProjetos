package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class EditPage {
    public static final By name = By.cssSelector("#Name");
    public static final By company = By.cssSelector("#Company");
    public static final By address = By.cssSelector("#Address");
    public static final By city = By.cssSelector("#City");
    public static final By phone = By.cssSelector("#Phone");
    public static final By email = By.cssSelector("#Email");

    public static final By saveBtn = By.cssSelector("body > div > form > div > div:nth-child(10) > div > input");

    public void preencherNameEditado() {
        BaseTest.clear(name);
        BaseTest.sendKeys(name, "GustavoEditado ");
    }
    public void preencherCompanyEditado() {
        BaseTest.clear(company);
        BaseTest.sendKeys(company, "DBC COMPANY");
    }
    public void preencherAddressEditado() {
        BaseTest.clear(address);
        BaseTest.sendKeys(address, "Brasil");
    }
    public void preencherCityEditado() {
        BaseTest.clear(city);
        BaseTest.sendKeys(city, "Brasil");
    }
    public void preencherPhoneEditado() {
        BaseTest.clear(phone);
        BaseTest.sendKeys(phone, "05198986051");
    }
    public void preencherEmailEditado() {
        BaseTest.clear(email);
        BaseTest.sendKeys(email, "gustavo@outlook.com");
    }
    public void clicarNoSaveBtn() {BaseTest.click(saveBtn);}
}
