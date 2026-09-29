package io.github.sultanurlanov.ui.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    By addToCart = By.cssSelector("[data-test='add-to-cart']");
    By quantity = By.cssSelector("[data-test='cart-quantity']");
    By productName = By.cssSelector("[data-test='product-name']");
    By cartIcon = By.cssSelector("[data-test='nav-cart']");
    By toastComponent = By.cssSelector("[toast-component]");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickAddToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(toastComponent));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(toastComponent));
    }

    public String getCartQuantity() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(quantity)).getText();

    }

    public String getProductName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productName)).getText().trim();
    }

    public CartPage clickCartIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
        return new CartPage(driver);
    }

//    public void waitToastAppear() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(toastComponent));
//    }
//
//    public void waitToastDisappear() {
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(toastComponent));
//    }

}
