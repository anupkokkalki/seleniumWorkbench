package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSessionPractiseQuitVsClose{

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
//		 driver.quit();
		 driver.close();
		 System.out.println(driver.getTitle());
		

	}

}


