package com.demoaut.newTour.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demount.newtour.Page.*;

public class BookTicketTest {
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");

	}

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
	
	@AfterTest
	public void CloseBrowser() {
		// TODO Auto-generated method stub
		driver.close();

	}
}
