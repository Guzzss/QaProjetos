package util;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Elements{

    public static void click(By by){
        waitElement(by);
        element(by).click();
    }

    public static String getText(By by){
        waitElement(by);
        return element(by).getText();
    }

    public static void sendKeys(By by, String texto) {
        waitElement(by);
        element(by).sendKeys(texto);
    }

    public static void clear(By by){
        waitElement(by);
        element(by).clear();

    }

    public static void hover(By by){
        waitElement(by);
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(by)).perform();
    }

    public static void esperar(int tempo) {
        driver.manage().timeouts().implicitlyWait(tempo, TimeUnit.SECONDS);
    }
}
