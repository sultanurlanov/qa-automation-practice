package io.github.sultanurlanov.ui.tests;

import io.github.sultanurlanov.ui.base.BaseTest;
import io.github.sultanurlanov.ui.pages.AccountPage;
import io.github.sultanurlanov.ui.pages.HomePage;
import io.github.sultanurlanov.ui.pages.LoginPage;
import io.github.sultanurlanov.ui.pages.RegisterPage;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    @Description("тест авторизации")
    public void loginTest() throws InterruptedException {

        String email = "test" + System.currentTimeMillis() + "@test.com";

        HomePage homePage = new HomePage(driver);

        LoginPage loginPage = homePage.clickSignIn();
        RegisterPage registerPage = loginPage.clickRegister();
        LoginPage loginPageAfterRegister = registerPage.registerForm(email);
        AccountPage accountPage = loginPageAfterRegister.login(email,"Test12321!");
        Assert.assertTrue(accountPage.ismenuVisible());
    }
}
