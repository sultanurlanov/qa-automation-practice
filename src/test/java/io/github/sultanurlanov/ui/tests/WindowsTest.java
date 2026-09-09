package io.github.sultanurlanov.ui.tests;

import io.github.sultanurlanov.ui.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowsTest extends BaseTest {

    @Test
    public void testNewWindow() {

        driver.get("https://the-internet.herokuapp.com/windows");

        String originWindow = driver.getWindowHandle();

        driver.findElement(By.cssSelector("a[href='/windows/new']")).click();

        for (String handle : driver.getWindowHandles()){
            if (!handle.equals(originWindow)){
                driver.switchTo().window(handle);
            }
        }

        String newText = driver.findElement(By.tagName("h3")).getText();
        System.out.println("Текст в новой вкладке: " + newText);
        Assert.assertEquals(newText, "New Window");

        driver.switchTo().window(originWindow);
        String originalText = driver.findElement(By.tagName("h3")).getText();
        System.out.println("Текст в исходной вкладке: " + originalText);

    }
}
