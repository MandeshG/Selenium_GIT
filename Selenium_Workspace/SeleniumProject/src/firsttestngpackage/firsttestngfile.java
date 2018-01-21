package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firsttestngfile {
	public String baseUrl = "http://demo.guru99.com/selenium/newtours/";
	public WebDriver driver;

	@AfterTest // Jumbled
	public void terminateBrowser() {
		driver.close();
	}

	@BeforeTest // Jumbled
	public void launchBrowser() {
		System.out.println("launching firefox browser");

		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}

	@Test // Jumbled
	public void verifyHomepageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
