package aashiKhushi.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingURL_Chrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://artoftesting.com");
		
	
	
	
	}

}
