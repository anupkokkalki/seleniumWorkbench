package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.edge.driver", "C:\\WebDrivers\\msedgedriver.exe");

//		 EdgeDriver driver = new EdgeDriver();
		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
		/**
		 * getting the title of the page and validating the title
		 * 
		 */
		driver.get("https://www.google.com");

		String title = driver.getTitle();
		System.out.println("act title :" + title);

		if (title.equals("Google")) {
			System.out.println("correct title - Pass");

		} else {
			System.out.println("incorrect title");

		}
		// driver.quit();

		// 0. valid but recommended only for the specific browser
		//	ChromeDriver driver = new ChromeDriver();

		// 1. valid but not recommended
		// SearchContext sc = new ChromeDriver();

		// 2. valid and recommended -- local execution
		// WebDriver driver = new ChromeDriver();

		// 3. valid and recommended -- local execution
		// RemoteWebDriver driver = new ChromeDriver();

		// 4. valid only for chrome/edge
		//ChromiumDriver driver = new ChromeDriver();
		//driver = new EdgeDriver();
		// driver = new FirefoxDriver();

		// 5. valid and recommended -- used for remote execution/sel grid/cloud/docker -
		// aws/browser stack/LT
		// WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);

		// 6. valid but not recommended
		// SearchContext sc = new RemoteWebDriver(remoteAddress, capabilities);
		driver.close();

	}

}
