package stepdefinations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.CustomerRegistrationPage;
import pageclasses.HomePage;
import pageclasses.SignInPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class LoginStepDefinations {

	WebDriver driver;
	HomePage hp;
	CustomerRegistrationPage crPage;
	SignInPage siPage;

	@Given("Browser is launched successfully")
	public void browser_is_launched_successfully() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Given("User can access software testing site {string}")
	public void user_can_access_software_testing_site(String url) {
		driver.get(url);
	}

	@When("User clicks on Sign In option from menu")
	public void user_clicks_on_sign_in_option_from_menu() {

		hp = new HomePage(driver);
		hp.clickSignIn();

		// driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	}

	@When("User clicks on Register your account")
	public void user_clicks_on_register_your_account() {

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

	@Then("Browser is closed")
	public void browser_is_closed() {
		driver.quit();
	}

}
