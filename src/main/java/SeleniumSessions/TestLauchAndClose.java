package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestLauchAndClose {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.getTitle();
	if(driver.getTitle().equals("Google")) {
		System.out.println("correct title - Pass");
		}else {
			
			System.out.println("incorrect title");
		}
	driver.close();
	

}
}
