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

	public FlightFinder_DropdownSelection(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Passengerdropdown() {
		Select PP = new Select(Passenger);
		List<WebElement> count=PP.getOptions();
		int size = count.size();
		for (int i = 0; i < size; i++) {

			String value = count.get(i).getText();
			System.out.println(value);
			int dropdown = rand.nextInt(count.size());
			count.get(dropdown).click();

		}

	}

}
