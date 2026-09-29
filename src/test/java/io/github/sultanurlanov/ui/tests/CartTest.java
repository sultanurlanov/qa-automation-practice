package io.github.sultanurlanov.ui.tests;

import io.github.sultanurlanov.ui.base.BaseTest;
import io.github.sultanurlanov.ui.pages.CartPage;
import io.github.sultanurlanov.ui.pages.HomePage;
import io.github.sultanurlanov.ui.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void cartTest() {

        HomePage homePage = new HomePage(driver);
        ProductPage productPage = homePage.clickFirstProduct();
        String productName = productPage.getProductName();
        productPage.clickAddToCart();
        String quantity = productPage.getCartQuantity();
        CartPage cartPage = productPage.clickCartIcon();
        String productNameInCart = cartPage.getProductName();


        Assert.assertEquals(quantity, "1");
        Assert.assertEquals(productName, productNameInCart);
    }

}
