package io.github.sultanurlanov.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait;

    By productNameInCart = By.cssSelector("[data-test='product-title']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getProductName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productNameInCart)).getText().trim();
    }
}
