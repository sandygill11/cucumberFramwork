package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By emailId = By.id("email");
	By passwordId = By.id("password");
	By loginButtonXpath = By.xpath("//input[@type='submit']");
	By invalidMsgXpath = By.xpath("//div[@class='help-block']");

	public void enterEmail(String email) {
		driver.findElement(emailId).sendKeys(email);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordId).sendKeys(password);
	}

	public void clickOnLoginButton() {
		driver.findElement(loginButtonXpath).click();
	}

	public String invalidEmailorPassword() {
		return driver.findElement(invalidMsgXpath).getText();
	}

}
