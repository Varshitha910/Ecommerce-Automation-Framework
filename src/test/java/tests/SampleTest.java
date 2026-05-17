package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class SampleTest extends BaseTest {

    @Test
    public void verifyTitle() {

        String title = driver.getTitle();

        System.out.println(title);

        Assert.assertTrue(title.contains("Swag"));
    }
}