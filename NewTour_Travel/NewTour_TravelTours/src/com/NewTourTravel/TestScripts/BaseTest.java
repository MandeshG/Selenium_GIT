package com.NewTourTravel.TestScripts;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	WebDriver driver;
	@BeforeClass
	public void Launch_Application(){
		
		System.setProperty("webdriver.chrome.driver", "M:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String expectedTitle= "Welcome: Mercury Tours";
		boolean flag= false;
		if(driver.getTitle().equalsIgnoreCase(expectedTitle)){
			flag=true;
		}
		Assert.assertTrue(flag, "Page not match");
		
	
		
	}
	
	@AfterClass
	public void CloseApp(){
	driver.close();
		
	}

}
