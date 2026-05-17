package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestListener.class)

public class APITest {

    @Test
    public void sampleTest() {

        System.out.println("Executing Test");

        Assert.assertTrue(true);
    }
}