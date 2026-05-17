package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void verifyProductAddToCart() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        ProductPage productPage = new ProductPage(driver);

        productPage.addProductToCart();

        System.out.println("Product Added To Cart Successfully");
    }
}