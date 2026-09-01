package io.github.sultanurlanov.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {

    WebDriver driver;

    By navmenuField = By.cssSelector("[data-test='nav-menu']");

    public AccountPage (WebDriver driver){
        this.driver = driver;
    }

    public boolean ismenuVisible() {
        return driver.findElement(navmenuField).isDisplayed();
    }
}
