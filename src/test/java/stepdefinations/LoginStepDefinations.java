package stepdefinations;

import org.testng.Assert;

import hooks.TestHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.CustomerRegistrationPage;
import pageclasses.HomePage;
import pageclasses.LoginPage;
import pageclasses.SignInPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class LoginStepDefinations {

	WebDriver driver = TestHooks.driver;
	HomePage hp;
	CustomerRegistrationPage crPage;
	SignInPage siPage;
	LoginPage logPage;

	@Given("User can access software testing site {string}")
	public void user_can_access_software_testing_site(String url) {
		//driver = TestHooks.driver;
		driver.get(url);
	}

	@When("User clicks on Sign In option from menu")
	public void user_clicks_on_sign_in_option_from_menu() throws NumberFormatException, IOException {

		hp = new HomePage(driver);
		hp.clickSignIn();
		logPage = new LoginPage(driver);

		// driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	}

	@When("User clicks on Register your account")
	public void user_clicks_on_register_your_account() throws NumberFormatException, IOException {

		siPage = new SignInPage(driver);
		siPage.clickOnRegisterAccount();

		// driver.findElement(By.xpath("//a[text()='Register your account']")).click();
	}

	@Then("User lands to Customer Registration Page")
	public void user_lands_to_customer_registration_page() {
		crPage = new CustomerRegistrationPage(driver);
		String heading = crPage.getHeadingText();
		Assert.assertEquals(heading, "Customer registration");
	}

	@When("User fills FistName {string}")
	public void user_fills_fist_name(String firstName) {
		// driver.findElement(By.id("first_name")).sendKeys(firstName);
		crPage.enterFirstName(firstName);
	}

	@When("User fills LastName {string}")
	public void user_fills_last_name(String lastName) {
		// driver.findElement(By.id("last_name")).sendKeys(lastName);
		crPage.enterLastName(lastName);
	}

	@Then("Validate if Register Button is Displayed")
	public void validate_if_register_button_is_displayed() {
		boolean isRegisterButtonDisplayed = crPage.isRegButtonDisplayed();
		// System.out.println(isRegisterButtonDisplayed);
		Assert.assertEquals(isRegisterButtonDisplayed, true);
	}

	@When("User enters email {string}")
	public void user_enters_email(String string) {
		//logPage = new LoginPage(driver);
		logPage.enterEmail(string);
	}

	@When("User enters password {string}")
	public void user_enters_password(String string) {
		logPage.enterPassword(string);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		logPage.clickOnLoginButton();
	}

	@Then("Validate the message")
	public void validate_the_message() {
		String invalidMsg = logPage.invalidEmailorPassword();
		Assert.assertEquals(invalidMsg, "Invalid email or password");
	}

}
