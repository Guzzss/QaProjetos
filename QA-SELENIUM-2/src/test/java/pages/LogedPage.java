package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class LogedPage {
    public static final By search = By.cssSelector("#search_query_top");
    public static final By searchBtn = By.cssSelector("#searchbox > button");
    public static final By withListBtn = By.cssSelector("#center_column > div > div:nth-child(2) > ul > li > a");
    public static final By voltarPraLogedPage = By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a");

    public static final By verificarUserLogado = By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span");

    public static final By verificarSeEstaLogado = By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a");

    public void search() {
        BaseTest.sendKeys(search, "printed");
    }

    public void clicarNoSearch() {
        BaseTest.click(searchBtn);
    }

    public void ClicarNoWhiteList() {BaseTest.click(withListBtn);}

    public void ClicarNoVoltarPraLogedPage() {BaseTest.click(voltarPraLogedPage);}

    public String verificarUserLogado() {
       return BaseTest.getText(verificarUserLogado);
    }

    public String verificarLogado() {
        return BaseTest.getText(verificarSeEstaLogado);
    }

}
