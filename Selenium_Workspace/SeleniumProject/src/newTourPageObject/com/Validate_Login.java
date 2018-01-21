package newTourPageObject.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Validate_Login {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}

	@Test
	public void loginNewTour() {
		LoginElements ll = new LoginElements(driver);

		ll.username("mercury");
		ll.password("mercury");
		ll.signOn();

	}

}
