package DemoQAPageObject.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;

	@BeforeTest
	public void SetUp() {
		driver = new FirefoxDriver();
		driver.get("http://store.demoqa.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void LoginTestWithPOM() {
		WebElement MyAccountLink = driver.findElement(By.className("account_icon"));
		MyAccountLink.click();
		LoginPOM LoginPage = new LoginPOM(driver);
		LoginPage.LoginWithoutCookies("TestUserName", "TestPassword");

	}

}
