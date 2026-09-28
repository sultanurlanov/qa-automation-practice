package io.github.sultanurlanov.ui.tests;

import io.github.sultanurlanov.ui.base.BaseTest;
import io.github.sultanurlanov.ui.pages.HomePage;
import io.github.sultanurlanov.ui.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void cartTest() {

        HomePage homePage = new HomePage(driver);
        ProductPage productPage = homePage.clickFirstProduct();
        productPage.clickAddToCart();
        String quantity = productPage.getCartQuantity();

        Assert.assertEquals(quantity, "1");
    }

}
