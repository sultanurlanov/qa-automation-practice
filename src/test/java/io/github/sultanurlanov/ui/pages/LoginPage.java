package io.github.sultanurlanov.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By emailField = By.cssSelector("[data-test='email']");
    By passwordField = By.cssSelector("[data-test='password']");
    By loginButton = By.cssSelector("[data-test='login-submit']");
    By registerlink = By.cssSelector("[data-test='register-link']");
    By loginForm = By.cssSelector("[data-test='login-form']");

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    public AccountPage login (String email, String password) {
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
