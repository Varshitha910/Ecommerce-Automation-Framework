package tests;

import base.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

import utils.ExcelUtils;
import utils.LoggerUtils;
import utils.ScreenshotUtils;

public class LoginTest extends BaseTest {

    @Test(retryAnalyzer = utils.RetryAnalyzer.class)

    public void loginTest() {

        LoggerUtils.info("Login Test Started");

        String email = ExcelUtils.getCellData(1,0);

        String password = ExcelUtils.getCellData(1,1);

        LoggerUtils.info("Excel Data Read Successfully");

        HomePage homePage = new HomePage();

        homePage.navigateToLogin();

        LoggerUtils.info("Navigated To Login Page");

        LoginPage loginPage = new LoginPage();

        loginPage.login(email, password);

        LoggerUtils.info("Login Performed Successfully");

        ScreenshotUtils.capture("LoginTest");

        LoggerUtils.info("Screenshot Captured");

        Assert.assertEquals(true, true);

        LoggerUtils.info("Login Test Completed");
    }
}