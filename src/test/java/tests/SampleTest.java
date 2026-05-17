package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class SampleTest extends BaseTest {

    @Test(priority = 1,
            groups = "smoke")

    public void verifyTitle() {

        DriverFactory.getDriver()
                .get("https://www.saucedemo.com/");

        String title =
                DriverFactory.getDriver()
                .getTitle();

        System.out.println(title);

        Assert.assertTrue(
                title.contains("Swag Labs"));
    }
}