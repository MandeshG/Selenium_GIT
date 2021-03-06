package com.demoaut.newTour.TestScripts;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;



public class BaseTest {
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		String  expectedPageTitle= "Welcome: Mercury Tours";
		boolean flag= false;
		if(driver.getTitle().equalsIgnoreCase(expectedPageTitle)){
			flag= true;
		}
		Assert.assertTrue(flag, "Page Title not match");

	}
	
	

	@AfterClass
	public void CloseBrowser() {
		driver.close();

	}

}
