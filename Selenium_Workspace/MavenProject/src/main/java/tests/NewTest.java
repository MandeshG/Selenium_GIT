package tests;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {

	WebDriver driver;

	@Test
	public void openMyBlog() {
		driver.get("http://www.softwaretestingmaterial.com/");

	}

	@BeforeClass
	public void launchURL() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
