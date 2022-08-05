package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class LogedPage {
    public static final By search = By.cssSelector("#search_query_top");
    public static final By searchBtn = By.cssSelector("#searchbox > button");

    public void search() {
        BaseTest.sendKeys(search, "printed");
    }

    public void clicarNoSearch() {
        BaseTest.click(searchBtn);
    }
}
