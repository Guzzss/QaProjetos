package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class CompraPage {
    public static final By continuarCompra2 = By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium");
    public static final By addComentario = By.cssSelector("#ordermsg > textarea");
    public static final By continuarCompra3 = By.cssSelector("#center_column > form > p > button");

    public static final By termosBtn = By.cssSelector("#cgv");

    public static final By continuarCompra4 = By.cssSelector("#form > p > button");

    public static final By addMetodoPagamento = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");

    public static final By confirmarCompra = By.cssSelector("#cart_navigation > button");

    public static final By nomeRoupa = By.cssSelector("td[class='cart_description'] p[class='product-name'] a");
    public void continuarCompra2() {
        BaseTest.click(continuarCompra2);
    }

    public void addComentario() {
        BaseTest.sendKeys(addComentario, "Show!");
    }

    public void continuarCompra3() {
        BaseTest.click(continuarCompra3);
    }

    public void clicarNoTermosBtn() {
        BaseTest.click(termosBtn);
    }

    public void continuarCompra4() {
        BaseTest.click(continuarCompra4);
    }

    public void addMetodoPagamento() {
        BaseTest.click(addMetodoPagamento);
    }

    public void confirmarCompra() {
        BaseTest.click(confirmarCompra);
    }

    public String nomeRoupa() {
        return BaseTest.getText(nomeRoupa);
    }
}
