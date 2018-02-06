package com.NewTourTravel.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	//Declaring the Variable
	
	@FindBy(name="userName")
	private WebElement user;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(name="login")
	private WebElement SignOn;
	
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void application_login(String username, String password){
		user.sendKeys(username);
		pwd.sendKeys(password);
		SignOn.click();
		
	}
	

}
