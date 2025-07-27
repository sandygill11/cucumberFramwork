package utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageActions {

	private WaitUtils waitUtils;

	public PageActions(WebDriver driver) throws NumberFormatException, IOException {
		waitUtils = new WaitUtils(driver);

	}

	public void click(By locator) {
		try {
			WebElement element = waitUtils.waitForElementClickable(locator);
			element.click();
		} catch (Exception e) {
			throw e;
		}
	}

	public void type(By locator, String text) {
		try {
			WebElement element = waitUtils.waitForElementVisible(locator);
			element.clear();
			element.sendKeys(text);
		} catch (Exception e) {
			throw e;
		}
	}

	public String getText(By locator) {
		try {
			WebElement element = waitUtils.waitForElementVisible(locator);
			String text = element.getText();
			return text;
		} catch (Exception e) {
			throw e;
		}
	}

	public boolean isDisplayed(By locator) {
		try {
			boolean visible = waitUtils.waitForElementVisible(locator).isDisplayed();
			return visible;
		} catch (Exception e) {
			return false;
		}
	}

}
