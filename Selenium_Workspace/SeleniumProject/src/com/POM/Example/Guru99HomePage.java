package com.POM.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99HomePage {
	WebDriver driver;
	
	By homePageUserName = By.xpath("//table//tr[@class='heading3']");
	
	public Guru99HomePage(WebDriver driver){
		this.driver= driver;
		
		
	}
	
	//Get the user name from the home page
	public String getname(){
		return driver.findElement(homePageUserName).getText();

		
	}

	

}
