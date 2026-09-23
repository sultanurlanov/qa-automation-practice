package io.github.sultanurlanov.ui.tests;

import io.github.sultanurlanov.api.helpers.UserHelper;
import io.github.sultanurlanov.ui.base.BaseTest;
import io.github.sultanurlanov.ui.pages.AccountPage;
import io.github.sultanurlanov.ui.pages.HomePage;
import io.github.sultanurlanov.ui.pages.LoginPage;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    @Description("тест авторизации")
    public void loginTest() throws InterruptedException {

        String email = UserHelper.createUser();

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickSignIn();
        AccountPage accountPage = loginPage.login(email, UserHelper.PASSWORD);
        Assert.assertTrue(accountPage.isMenuVisible());
    }
}
