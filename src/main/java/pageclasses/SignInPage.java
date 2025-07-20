package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

	WebDriver driver;

	public SignInPage(WebDriver driver) {

		this.driver = driver;
	}

	By RegisterYourAccountLink = By.xpath("//a[text()='Register your account']");

	public void clickOnRegisterAccount() {
		driver.findElement(RegisterYourAccountLink).click();
	}
}
