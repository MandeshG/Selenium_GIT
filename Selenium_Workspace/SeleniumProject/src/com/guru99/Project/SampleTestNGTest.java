package com.guru99.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SampleTestNGTest {
	
	public static String baseurl = "http://newtours.demoaut.com/";
	public static WebDriver driver = new FirefoxDriver();
	
	
	@BeforeTest
	public void setBASEURL(){
		driver= new FirefoxDriver();
		driver.get(baseurl);
		
		}
		
	@Test
	public void verifyHomePage(){
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();	
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void end(){
		driver.quit();
	}

}
