/**
 * 
 */
package com.NewTourTravel.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjectModel.LoginPage;

/**
 * @author mandesh
 *
 */
public class VerifyLogin {

	@Test
	public void VerifyValidLogin() {

		WebDriver driver = new FirefoxDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Launch the URL
		driver.get("http://www.newtours.demoaut.com/");
		
		LoginPage login= new LoginPage(driver);
		login.LoginToApplication("Mercury", "Mercury");
		
		driver.quit();
	}

}
