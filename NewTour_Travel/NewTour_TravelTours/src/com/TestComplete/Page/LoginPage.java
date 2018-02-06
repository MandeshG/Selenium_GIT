package com.TestComplete.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name = "ctl00$MainContent$username")
	WebElement Username;

	@FindBy(name = "ctl00$MainContent$password")
	WebElement Password;

	@FindBy(name = "ctl00$MainContent$login_button")
	WebElement Submit;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loginApplication(String uID, String pwd) {
		Username.sendKeys(uID);
		Password.sendKeys(pwd);
		Submit.click();

	}

}
