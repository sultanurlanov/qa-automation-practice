package io.github.sultanurlanov.ui.tests;

import io.github.sultanurlanov.ui.base.BaseTest;
import io.github.sultanurlanov.ui.pages.HomePage;
import io.github.sultanurlanov.ui.pages.LoginPage;
import io.github.sultanurlanov.ui.pages.RegisterPage;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    @Description("Регистрация")
    public void RegisterTest() {

        String email = "sultan" + System.currentTimeMillis() + "@test.com";

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickSignIn();
        RegisterPage registerPage = loginPage.clickRegister();
        LoginPage loginPageAfterRegister = registerPage.registerForm(email);
        Assert.assertTrue(loginPageAfterRegister.isVisibleLogin());
    }
}
