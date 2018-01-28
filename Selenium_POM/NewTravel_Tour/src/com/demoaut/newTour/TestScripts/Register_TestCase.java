package com.demoaut.newTour.TestScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.demount.newtour.Page.Register_Page;

public class Register_TestCase extends BaseTest{
	
	
	@Test
	public void RegisterUser(){
		Register_Page rr= new  Register_Page(driver);
		rr.contacInfo("Mandesh", " Giri", "123456456", "kritdhakal@gmail.com");
		rr.mailing();
		rr.UserInfo();
		rr.submit();
		
		String expectedMessage= driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		System.out.println(expectedMessage);
		String actualMessage= driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p:nth-child(3) > a > font > b")).getText();
		System.out.println(actualMessage);
		Assert.assertEquals(actualMessage, expectedMessage);
	
	}

	
	
	
}