package com.demount.newtour.Page;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder_DropdownSelection {
	Random rand = new Random();

	@FindBy(name = "passCount")
	WebElement Passenger;

	@FindBy(name = "fromPort")
	WebElement departure;

	@FindBy(name = "fromMonth")
	WebElement Departure_Month;

	@FindBy(name = "fromDay")
	WebElement Departure_Date;

	@FindBy(name = "toPort")
	WebElement Arrival;

	@FindBy(name = "toMonth")
	WebElement R_Month;

	@FindBy(name = "toDay")
	WebElement R_Day;

	@FindBy(name = "airline")
	WebElement airlines;

	public FlightFinder_DropdownSelection(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Passengerdropdown() {
		Select PP = new Select(Passenger);
		List<WebElement> count = PP.getOptions();
		int size = count.size();
		for (int i = 0; i < size; i++) {

			String value = count.get(i).getText();
			System.out.println(value);
			int dropdown = rand.nextInt(count.size());
			count.get(dropdown).click();

		}

		Select dd = new Select(departure);
		List<WebElement> CC = dd.getOptions();
		int Dsize = CC.size();

		for (int j = 0; j < Dsize; j++) {
			String dvalue = CC.get(j).getText();
			System.out.println(dvalue);
			
			int dDropdown = rand.nextInt(CC.size());
			CC.get(dDropdown).click();

		}
		Select DMonth = new Select(Departure_Month);
		List<WebElement> AM = DMonth.getOptions();
		int Asize = AM.size();

		for (int i = 0; i < Asize; i++) {
			String Month = AM.get(i).getText();
			System.out.println(Month);
			
			int monthDropdown = rand.nextInt(AM.size());
			AM.get(monthDropdown).click();

		}

		Select DDate = new Select(Departure_Date);
		List<WebElement> AD = DDate.getOptions();
		int nSize = AD.size();

		for (int i = 0; i < nSize; i++) {
			String Day = AD.get(i).getText();
			System.out.println(Day);
			int dayCount = rand.nextInt(AD.size());
			AD.get(dayCount).click();
		}

		Select AA = new Select(Arrival);
		List<WebElement> AR = AA.getOptions();
		int AS = AR.size();

		for (int i = 0; i < AS; i++) {
			String Arrival_City = AR.get(i).getText();
			System.out.println(Arrival_City);
			
			int City = rand.nextInt(AR.size());
			AR.get(City).click();

		}

		Select RMonth = new Select(R_Month);
		List<WebElement> RM = RMonth.getOptions();
		int rSize = RM.size();

		for (int i = 0; i < rSize; i++) {
			String rDate = RM.get(i).getText();
			System.out.println(rDate);

			int Select_ADate = rand.nextInt(RM.size());
			AM.get(Select_ADate).click();
		}

		Select RDay = new Select(R_Day);
		List<WebElement> RD = RDay.getOptions();
		int DayR = RD.size();

		for (int i = 0; i < DayR; i++) {
			String returnDay = RD.get(i).getText();
			System.out.println(returnDay);

			int selectionDate = rand.nextInt(RD.size());
			RD.get(selectionDate).click();

		}

		Select ar = new Select(airlines);
		List<WebElement> AD1 = ar.getOptions();
		int AAS = AD1.size();

		for (int i = 0; i < AAS; i++) {

			String select_Airlines = AD1.get(i).getText();
			System.out.println(select_Airlines);

			int newSelection = rand.nextInt(AD1.size());
			AD1.get(newSelection).click();

		}

	}

}
