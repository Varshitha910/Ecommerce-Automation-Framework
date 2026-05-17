package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.DriverFactory;

public class BasePage {

    protected WebDriver driver;

    protected WebDriverWait wait;

    public BasePage() {

        driver = DriverFactory.getDriver();

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10));
    }
}