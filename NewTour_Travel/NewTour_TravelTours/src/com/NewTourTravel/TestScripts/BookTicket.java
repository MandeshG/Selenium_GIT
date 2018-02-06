package com.NewTourTravel.TestScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.NewTourTravel.Page.*;

public class BookTicket extends BaseTest {
	
	@Test
	public void bookTicket(){
		LoginPage lp= new LoginPage(driver);
		FlightFinder ff= new FlightFinder(driver);
		FlightFinder_DropdownSelection fs= new FlightFinder_DropdownSelection(driver);
		SelectFlight sf= new SelectFlight(driver);
		BookAFlight bf= new BookAFlight(driver);
	
		
		lp.application_login("mercury", "mercury");
		fs.Passengerdropdown();
		ff.Flightfinder();
		sf.flightSelection();
		bf.flightBooking("AAravi", "Giri", "12134414");
		
		String expectedMessage= "Your itinerary has been booked!";
		String actualMessage= driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font > b > font:nth-child(2)")).getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}

}
