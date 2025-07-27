package utils;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	private WebDriverWait wait;

	public WaitUtils(WebDriver driver) throws NumberFormatException, IOException {
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.valueOf(BaseUtils.getConfigValue("wait")))); // You can parameterize timeout
	}

	public WebElement waitForElementVisible(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public WebElement waitForElementClickable(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public boolean waitForElementInvisible(By locator) {
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	public Alert waitForAlertPresent() {
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public boolean waitForTitleContains(String titleFragment) {
		return wait.until(ExpectedConditions.titleContains(titleFragment));
	}

	public boolean waitForUrlToContain(String urlFragment) {
		return wait.until(ExpectedConditions.urlContains(urlFragment));
	}

	public void waitForElementTextToBe(By locator, String text) {
		wait.until(ExpectedConditions.textToBe(locator, text));
	}

	public List<WebElement> waitForElementsVisible(By locator) {
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

}
