package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	/**
	 * @author mandesh This class woth store all teh locator and methods of
	 *         login Page
	 * 
	 */

	WebDriver driver;
	By username = By.name("userName");
	By password = By.name("password");
	By Login = By.name("login");

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}
	
	
	public void LoginToApplication(String uID,String uPwd){
		driver.findElement(username).sendKeys(uID);
		driver.findElement(password).sendKeys(uPwd);
		driver.findElement(Login).click();

		
	}

	

}
