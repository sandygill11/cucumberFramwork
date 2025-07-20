package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerRegistrationPage {

	public CustomerRegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver;

	By HeadingXpath = By.xpath("//h3[text()='Customer registration']");
	By firstNameId = By.id("first_name");
	By lastNameId = By.id("last_name");
	By ButtonXpath = By.xpath("//button[@type= 'submit']");

	public String getHeadingText() {
		return driver.findElement(HeadingXpath).getText();
	}

	public void enterFirstName(String firstName) {
		driver.findElement(firstNameId).sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		driver.findElement(lastNameId).sendKeys(lastName);
	}

	public boolean isRegButtonDisplayed() {
		return driver.findElement(ButtonXpath).isDisplayed();

	}

}
