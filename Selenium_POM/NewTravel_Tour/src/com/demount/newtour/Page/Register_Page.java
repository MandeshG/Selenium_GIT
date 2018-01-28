package com.demount.newtour.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register_Page {
	
	@FindBy(xpath= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	WebElement Register;
	
	@FindBy(name="firstName")
	WebElement FirstName;
	
	@FindBy(name="lastName")
	WebElement LastName;
	
	@FindBy(name="phone")
	WebElement Phone;
	
	@FindBy(id="userName")
	WebElement Email;
	
	@FindBy(name="address1")
	WebElement Address;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement State;
	
	@FindBy(name="postalCode")
	WebElement PostalCode;
	

	@FindBy(name="country")
	WebElement Country;
	
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement Password;
	

	@FindBy(name="confirmPassword")
	WebElement Confirm;
	
	@FindBy(name="register")
	WebElement Submit;
	
	
	public Register_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void contacInfo(String FName, String LName, String ph, String email){
		
		Register.click();
		FirstName.sendKeys( FName );
		LastName.sendKeys(LName);
		Phone.sendKeys(ph);
		Email.sendKeys(email);
		
	}
	
	public void mailing(){
		Address.sendKeys("12356 Gaithersburg");
		City.sendKeys("FlowerHill");
		State.sendKeys("MD");
		PostalCode.sendKeys("25652");
		
		Select dropdown= new Select(Country);
		dropdown.selectByIndex(10);
	
		
	}
public void UserInfo(){
	username.sendKeys("Madhu");
	Password.sendKeys("Mandesh");
	Confirm.sendKeys("Mandesh");
	
		
	}

public void submit(){
	Submit.click();
}
}




