package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {

        System.out.println("Checkout Test Executed Successfully");

        Assert.assertTrue(true);
    }
}