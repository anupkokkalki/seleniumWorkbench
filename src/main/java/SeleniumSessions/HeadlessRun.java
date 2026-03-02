package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		
		FirefoxOptions options = new FirefoxOptions();
		 options.addArguments("--headless");
		
//		WebDriver driver = new ChromeDriver(options);
		WebDriver driver = new FirefoxDriver(options);
		 driver.get("https://www.google.com");
		System.out.println("Title is: " + driver.getTitle());
		driver.quit();
	}

}
