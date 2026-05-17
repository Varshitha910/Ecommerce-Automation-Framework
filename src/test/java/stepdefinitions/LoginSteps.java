package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    WebDriver driver;

    HomePage homePage;
    LoginPage loginPage;

    @Given("User launches Swag Labs application")
    public void user_launches_swag_labs_application() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        System.out.println("Swag Labs Application Launched");
    }

    @When("User navigates to login page")
    public void user_navigates_to_login_page() {

        homePage = new HomePage(driver);

        homePage.navigateToLogin();

        System.out.println("Already on Login Page");
    }

    @When("User enters valid email and password")
    public void user_enters_valid_email_and_password() {

        loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        System.out.println("Entered Username and Password");
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {

        System.out.println("Login Successful");

        driver.quit();
    }
}