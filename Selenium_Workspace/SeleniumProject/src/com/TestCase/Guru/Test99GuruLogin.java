package com.TestCase.Guru;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.POM.Example.Guru99HomePage;
import com.POM.Example.Guru99Login;

public class Test99GuruLogin {
	WebDriver driver;
	Guru99Login objLogin;
	Guru99HomePage objHomePage;

	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");

		/*
		 * 
		 * This test case will login in http://demo.guru99.com/V4/
		 * 
		 * Verify login page title as guru99 bank
		 * 
		 * Login to application
		 * 
		 * Verify the home page using Dashboard message
		 * 
		 */

	}

	@Test
	public void testHomePage() {
		// Create Login Page object
		objLogin = new Guru99Login(driver);

		// Verify login page title
		//String loginPageTitle = objLogin.getLoginTitle();
		//Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		
		//login to application
		objLogin.logintoApplication("mngr111150", "ynudAsy");
		
		// go the next page
		objHomePage= new Guru99HomePage(driver);
		  Assert.assertTrue(objHomePage.getname().toLowerCase().contains("manger id : mngr111150"));

	}

}
