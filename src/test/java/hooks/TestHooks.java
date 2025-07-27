package hooks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.BaseUtils;

public class TestHooks {

	public static WebDriver driver;

	@Before
	public void init() throws IOException {

		String browser = BaseUtils.getConfigValue("browser");

		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();

			break;

		case "edge":
			driver = new EdgeDriver();

			break;

		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Browser not supported");
			break;
		}

		// driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@After
	public void endTest() {
		driver.quit();
	}

}
