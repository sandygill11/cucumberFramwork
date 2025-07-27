package pageclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import utils.PageActions;

public class BasePage {
	
	protected PageActions pageActions;
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) throws NumberFormatException, IOException {
		this.driver = driver;
		pageActions = new PageActions(driver);
	}

}
