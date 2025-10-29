package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver = new EdgeDriver();
//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		String title = driver.getTitle();
		System.out.println("act title :" + title);

		if (title.equals("Google")) {
			System.out.println("correct title - Pass");

		} else {
			System.out.println("incorrect title");

		}
		driver.quit();

	}

}
