package com.demount.newtour.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	// Declaring the Variables

	@FindBy(name = "userName")
	private WebElement user;

	@FindBy(name = "password")
	private WebElement pass;

	@FindBy(name = "login")
	private WebElement submit;
	
	
	public Login(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void applicationLogin(String username, String Password) {
		user.sendKeys(username);
		pass.sendKeys(Password);
		submit.click();
	}

}
