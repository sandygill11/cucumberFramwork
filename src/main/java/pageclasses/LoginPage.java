package pageclasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	WebDriver driver;

	public LoginPage(WebDriver driver) throws NumberFormatException, IOException {
		super(driver);
		//this.driver = driver;
	}

	By emailId = By.id("email");
	By passwordId = By.id("password");
	By loginButtonXpath = By.xpath("//input[@type='submit']");
	By invalidMsgXpath = By.xpath("//div[@class='help-block']");

	public void enterEmail(String email) {
		pageActions.type(emailId, email);
		// driver.findElement(emailId).sendKeys(email);
	}

	public void enterPassword(String password) {
		pageActions.type(passwordId, password);
		// driver.findElement(passwordId).sendKeys(password);
	}

	public void clickOnLoginButton() {
		pageActions.click(loginButtonXpath);
		// driver.findElement(loginButtonXpath).click();
	}

	public String invalidEmailorPassword() {
		return pageActions.getText(invalidMsgXpath);
		//return driver.findElement(invalidMsgXpath).getText();
	}

}
