package io.github.sultanurlanov.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {

    WebDriver driver;
    WebDriverWait wait;

    By firstnameField = By.cssSelector("[data-test='first-name']");
    By lastnameField = By.cssSelector("[data-test='last-name']");
    By dateField = By.cssSelector("[data-test='dob']");
    By countrySelect = By.cssSelector("[data-test='country']");
    By postalcodeField = By.cssSelector("[data-test='postal_code']");
    By housenumberField = By.cssSelector("[data-test='house_number']");
    By streetField = By.cssSelector("[data-test='street']");
    By cityField = By.cssSelector("[data-test='city']");
    By stateField = By.cssSelector("[data-test='state']");
    By phoneField = By.cssSelector("[data-test='phone']");
    By emailField = By.cssSelector("[data-test='email']");
    By passwordField = By.cssSelector("[data-test='password']");
    By registerClick = By.cssSelector("[data-test='register-submit']");

    public RegisterPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public LoginPage registerForm(String email) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(firstnameField));

        driver.findElement(firstnameField).sendKeys("Sultan");
        driver.findElement(lastnameField).sendKeys("Nurlanov");
        driver.findElement(dateField).sendKeys("1994-08-13");
        Select country = new Select(driver.findElement(countrySelect));
        country.selectByVisibleText("Kyrgyzstan");
        driver.findElement(postalcodeField).sendKeys("72000");
        driver.findElement(housenumberField).sendKeys("156/19");
        driver.findElement(streetField).sendKeys("7-April");
        driver.findElement(cityField).sendKeys("Bishkek");
        driver.findElement(stateField).sendKeys("Chyi");
        driver.findElement(phoneField).sendKeys("996550667567");
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys("Test1234!");
        driver.findElement(registerClick).click();
        return new LoginPage(driver);

    }
}
