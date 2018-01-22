package com.demoaut.newTour.TestScripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.demount.newtour.Page.Login;


public class InvalidUserTest extends BaseTest {
	

	
	@Test
	public void invalidTest(){
		Login lp = new Login(driver);
		lp.applicationLogin("mercury", "password");
		
		boolean signOnVisible= driver.findElement(By.linkText("SIGN-ON")).isDisplayed();
		Assert.assertTrue(signOnVisible);
	
	}
	
	
	
}
