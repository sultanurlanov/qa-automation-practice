package io.github.sultanurlanov.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    By emailField = By.cssSelector("[data-test='email']");
    By passwordField = By.cssSelector("[data-test='password']");
    By loginButton = By.cssSelector("[data-test='login-submit']");
    By registerlink = By.cssSelector("[data-test='register-link']");
    By loginForm = By.cssSelector("[data-test='login-form']");

    public LoginPage (WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public AccountPage login (String email, String password) throws InterruptedException {

        wait.until(ExpectedConditions.urlContains("/auth/login"));
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new AccountPage(driver);
    }


    public RegisterPage clickRegister () {
        driver.findElement(registerlink).click();
        return new RegisterPage(driver);
    }

    public boolean isVisibleLogin() {
        return driver.findElement(emailField).isDisplayed();
    }
}
