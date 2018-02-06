package com.NewTourTravel.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight {
	@FindBy(name = "passFirst0")
	private WebElement firstName;

	@FindBy(name = "passLast0")
	private WebElement lastName;

	@FindBy(name = "creditnumber")
	private WebElement creditCardNumber;

	@FindBy(name = "buyFlights")
	private WebElement submit;
	
	public BookAFlight(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void flightBooking(String fname,String lname, String cNum){
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		creditCardNumber.sendKeys(cNum);
		submit.click();
		
	}
	

}
