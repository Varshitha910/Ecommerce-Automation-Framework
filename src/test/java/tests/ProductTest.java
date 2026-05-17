package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test(priority = 3,
            groups = "smoke")

    public void verifyProductAddToCart() {

        LoginPage loginPage =
                new LoginPage();

        loginPage.login(
                "standard_user",
                "secret_sauce");

        ProductPage productPage =
                new ProductPage();

        // PRODUCT TO ADD
        productPage.addProductToCart(
                "Sauce Labs Backpack");

        productPage.openCart();

        String productName =
                productPage.getCartProductName();

        System.out.println(
                "Cart Product: " + productName);

        Assert.assertTrue(
                productName.contains(
                        "Sauce Labs Backpack"));
    }
}