

/*
 * package com.NewTourTravel.TestScripts;
 

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.NewTourTravel.Page.FlightFinder;
import com.NewTourTravel.Page.LoginPage;

public class FlightFinder_Dropdown extends BaseTest {


	public FlightFinder_Dropdown(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void Passengerdropdown() {

		LoginPage ll = new LoginPage(driver);
		FlightFinder ff = new FlightFinder(driver);

		ll.application_login("mercury", "mercury");

		Select Passenger = new Select(driver.findElement(By.name("passCount")));
		List<WebElement> count = Passenger.getOptions();
		int size = count.size();
		for (int i = 0; i < size; i++) {

			String value = count.get(i).getText();
			System.out.println(value);
			Random rand = new Random();
			int dropdown = rand.nextInt(count.size());
			count.get(dropdown).click();

		}

		Select departure = new Select(driver.findElement(By.name("fromPort")));
		List<WebElement> CC = departure.getOptions();
		int Dsize = CC.size();

		for (int j = 0; j < Dsize; j++) {
			String dvalue = CC.get(j).getText();
			System.out.println(dvalue);

			Random rand = new Random();
			int dDropdown = rand.nextInt(CC.size());
			CC.get(dDropdown).click();

		}

		Select Departure_Month = new Select(driver.findElement(By.name("fromMonth")));
		List<WebElement> AM = Departure_Month.getOptions();
		int Asize = AM.size();

		for (int i = 0; i < Asize; i++) {
			String Month = AM.get(i).getText();
			System.out.println(Month);
			Random rand = new Random();
			int monthDropdown = rand.nextInt(AM.size());
			AM.get(monthDropdown).click();

		}

		Select Departure_Date = new Select(driver.findElement(By.name("fromDay")));
		List<WebElement> AD = Departure_Date.getOptions();
		int nSize = AD.size();

		for (int i = 0; i < nSize; i++) {
			String Day = AD.get(i).getText();
			System.out.println(Day);
			Random rand = new Random();
			int dayCount = rand.nextInt(AD.size());
			AD.get(dayCount).click();
		}

		Select Arrival = new Select(driver.findElement(By.name("toPort")));
		List<WebElement> AR = Arrival.getOptions();
		int AS = AR.size();

		for (int i = 0; i < AS; i++) {
			String Arrival_City = AR.get(i).getText();
			System.out.println(Arrival_City);
			Random rand = new Random();
			int City = rand.nextInt(AR.size());
			AR.get(City).click();

		}

		Select R_Month = new Select(driver.findElement(By.name("toMonth")));
		List<WebElement> RM = R_Month.getOptions();
		int rSize = RM.size();

		for (int i = 0; i < rSize; i++) {
			String rDate = RM.get(i).getText();
			System.out.println(rDate);

			Random rand = new Random();

			int Select_ADate = rand.nextInt(RM.size());
			AM.get(Select_ADate).click();
		}
		
		Select R_Day= new Select(driver.findElement(By.name("toDay")));
		List<WebElement>RD=R_Day.getOptions();
		int  DayR= RD.size();
		
		
		for (int i = 0; i < DayR; i++) {
			String returnDay= RD.get(i).getText();
			System.out.println(returnDay);
			
			Random rd= new Random();
			int selectionDate= rd.nextInt(RD.size());
			RD.get(selectionDate).click();
			
		}
		
		
		Select airlines = new Select (driver.findElement(By.name("airline")));
		List<WebElement>AA=airlines.getOptions();
		int AAS= AA.size();
		
		for (int i = 0; i < AAS; i++) {
			
			String select_Airlines= AA.get(i).getText();
			System.out.println(select_Airlines);
			
			Random RT= new Random();
			int newSelection= RT.nextInt(AA.size());
			AA.get(newSelection).click();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
*/