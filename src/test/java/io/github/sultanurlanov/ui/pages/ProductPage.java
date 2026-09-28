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

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickAddToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
    }

    public String getCartQuantity() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(quantity)).getText();

    }

}
