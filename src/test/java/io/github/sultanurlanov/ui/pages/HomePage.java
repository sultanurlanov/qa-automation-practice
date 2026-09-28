package io.github.sultanurlanov.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

   WebDriver driver;
   WebDriverWait wait;

   By signInButton = By.cssSelector("[data-test='nav-sign-in']");
   By productCart = By.cssSelector("[data-test='product-name']");

   public HomePage (WebDriver driver) {
      this.driver = driver;
      wait = new WebDriverWait(driver, Duration.ofSeconds(10));

   }

   public LoginPage  clickSignIn() {
      wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
      return new LoginPage(driver);
   }

   public ProductPage clickFirstProduct() {
      wait.until(ExpectedConditions.elementToBeClickable(productCart)).click();
      return new ProductPage(driver);
   }
}
