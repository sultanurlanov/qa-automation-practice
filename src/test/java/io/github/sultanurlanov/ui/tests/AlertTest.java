package io.github.sultanurlanov.ui.tests;

import io.github.sultanurlanov.ui.base.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class AlertTest extends BaseTest {

        @Test
        public void testConfirmAlert() {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            // кликаем кнопку, которая вызывает confirm-окно
            driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();

            // переключаемся на алерт и читаем его текст
            String alertText = driver.switchTo().alert().getText();
            System.out.println("Текст алерта: " + alertText);

            // нажимаем Cancel
            driver.switchTo().alert().accept();

            // на странице появляется результат — что мы выбрали
            String result = driver.findElement(By.id("result")).getText();
            System.out.println("Результат: " + result);
            Assert.assertEquals(result, "You clicked: Ok");
        }

        @Test
        public void testPromtAlert() {

            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();

            Alert alert = driver.switchTo().alert();
            alert.sendKeys("test");
            alert.accept();

            String result = driver.findElement(By.id("result")).getText();
            System.out.println("Результат: " + result);
            Assert.assertEquals(result, "You entered: test");
        }
    }
