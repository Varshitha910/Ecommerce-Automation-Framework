package stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {

    @Before
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

            File src = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            try {

                FileUtils.copyFile(src,
                        new File("screenshots/" +
                        scenario.getName() + ".png"));

            } catch (IOException e) {

                e.printStackTrace();
            }
        }

        driver.quit();
    }
}