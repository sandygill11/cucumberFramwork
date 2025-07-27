package pageclasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {

	WebDriver driver;

	public SignInPage(WebDriver driver) throws NumberFormatException, IOException {
		super(driver);
		// this.driver = driver;
	}

	By RegisterYourAccountLink = By.xpath("//a[text()='Register your account']");

	public void clickOnRegisterAccount() {
		// PageActions pa = new PageActions(driver);
		pageActions.click(RegisterYourAccountLink);
		// driver.findElement(RegisterYourAccountLink).click();
	}
}
