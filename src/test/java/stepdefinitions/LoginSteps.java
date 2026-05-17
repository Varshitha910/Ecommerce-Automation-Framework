package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("User launches Swag Labs application")
    public void user_launches_swag_labs_application() {

        driver = BaseTest.driver;

        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);

        System.out.println("Swag Labs Application Launched");
    }

    @When("User navigates to login page")
    public void user_navigates_to_login_page() {

        System.out.println("Already on Login Page");
    }

    @When("User enters valid email and password")
    public void user_enters_valid_email_and_password() {

        loginPage.login("standard_user", "secret_sauce");

        System.out.println("Entered Username and Password");
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));

        System.out.println("Login Successful");
    }
}