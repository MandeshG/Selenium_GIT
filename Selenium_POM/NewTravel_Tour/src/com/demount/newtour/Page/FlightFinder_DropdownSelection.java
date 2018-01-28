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

			Random rand = new Random();
			int dDropdown = rand.nextInt(CC.size());
			CC.get(dDropdown).click();

		}

	}

}
