package stepdefinitions;

import base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSteps {

    WebDriver driver;

    @Before
    public void setup() {

        DriverFactory.initDriver();

        driver = DriverFactory.getDriver();

        System.out.println("Browser Launched");
    }

    @Given("User launches Swag Labs application")
    public void user_launches_swag_labs_application() {

        driver.get("https://www.saucedemo.com");

        System.out.println("Application Launched");
    }

    @When("User navigates to login page")
    public void user_navigates_to_login_page() {

        System.out.println("Navigated to Login Page");
    }

    @When("User enters valid email and password")
    public void user_enters_valid_email_and_password() {

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        System.out.println("Entered Username and Password");
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {

        String title = driver.getTitle();

        Assert.assertTrue(title.contains("Swag"));

        System.out.println("Login Successful");
    }

    @After
    public void tearDown() {

        DriverFactory.quitDriver();

        System.out.println("Browser Closed");
    }
}