package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver =
            new ThreadLocal<>();

    public static void initDriver() {

        String browser =
                ConfigReader.getProperty("browser");

        switch (browser.toLowerCase()) {

            case "chrome":

                WebDriverManager.chromedriver().setup();

                driver.set(new ChromeDriver());

                break;

            case "firefox":

                WebDriverManager.firefoxdriver().setup();

                driver.set(new FirefoxDriver());

                break;

            default:

                WebDriverManager.chromedriver().setup();

                driver.set(new ChromeDriver());
        }

        getDriver().manage().window().maximize();
    }

    public static WebDriver getDriver() {

        return driver.get();
    }

    public static void quitDriver() {

        getDriver().quit();

        driver.remove();
    }
}