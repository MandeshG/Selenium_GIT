package com.demoaut.newTour.TestScripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.demount.newtour.Page.*;


public class BookTicketTest extends BaseTest {
	
	@Test
	public void bookingTest(){
		Login lp = new Login(driver);
		FlightFinder ff= new FlightFinder(driver);
		SelectFlight sf= new SelectFlight(driver);
		BookAFlight bf= new BookAFlight(driver);
		
		
		lp.applicationLogin("mercury", "mercury");
		ff.findFlight();
		sf.flightSelection();
		bf.flightBooking("Aaravi", "Giri", "9879721-2-882");
		
		String expectedMessage= "Your itinerary has been booked!";
		String actualMessage= driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font > b > font:nth-child(2)")).getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	
	
}
