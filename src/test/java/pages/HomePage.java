package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public void navigateToLogin() {

        System.out.println("Login page opened");
    }
}