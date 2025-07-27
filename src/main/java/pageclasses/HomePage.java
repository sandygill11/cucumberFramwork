package pageclasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) throws NumberFormatException, IOException {
		super(driver);
		// this.driver = driver;
	}

	WebDriver driver;

	private By SignInLink = By.xpath("//a[text()='Sign in']");

	public void clickSignIn() {

		// driver.findElement(SignInLink).click();
		pageActions.click(SignInLink);
	}
}
