package com.demoaut.newTour.TestScripts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demount.newtour.Page.*;


public class ValidateUserTest extends BaseTest {
	
	
	@Test
	public void userValidation(){
		Login lp = new Login(driver);
		lp.applicationLogin("mercury", "mercury");
		
		 boolean signOoffvisible =driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
		 Assert.assertTrue(signOoffvisible);
	}
	
	

}
