package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class SearchPage {
    public static final By hover = By.cssSelector(".ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line");
    public static final By addToCart = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line.hovered > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default");
    public static final By proximaPaginaCompra = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a");

    public void addAoCarrinho() {
        BaseTest.hover(hover);
        BaseTest.click(addToCart);
    }

    public void proximaPaginaCompra() {
        BaseTest.click(proximaPaginaCompra);
    }

}
