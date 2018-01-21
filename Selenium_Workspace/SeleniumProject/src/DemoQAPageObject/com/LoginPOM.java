package DemoQAPageObject.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPOM {
	WebDriver driver;
	
	WebElement userNameEditBox;
	WebElement passwordEditBox;
	WebElement rememberCheckBox;
	WebElement loginButton;

	public LoginPOM(WebDriver driver) {
		userNameEditBox = driver.findElement(By.id("log"));
		passwordEditBox = driver.findElement(By.id("pwd"));
		rememberCheckBox = driver.findElement(By.id("rememberme"));
		loginButton = driver.findElement(By.id("login"));

	}

	public void LoginWithCookies(String userName, String password) {
		userNameEditBox.sendKeys(userName);
		passwordEditBox.sendKeys(password);
		loginButton.click();

	}

	public void LoginWithoutCookies(String userName, String password) {
		userNameEditBox.sendKeys(userName);
		passwordEditBox.sendKeys(password);
		rememberCheckBox.click();
		loginButton.click();

	}

}