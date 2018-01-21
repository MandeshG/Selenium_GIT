package aashiKhushi.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicCommand {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d;
		d = new FirefoxDriver();

		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String URL = "http://www.artoftesting.com/sampleSiteForSelenium.html";
		// Launch the sample Site of Selenium
		d.get(URL);

		// Maxmize the browser
		d.manage().window().maximize();

		System.out.println("The URL is:" + URL);

		// Fetch the Text "This is the Sample Text and fetch the text

		String SampleText = d.findElement(By.id("idOfDiv")).getText();

		if (SampleText == "This is the Sample Text and fetch the text") {
			System.out.println("The Text is :" + SampleText);

		} else {
			System.out.println("The Text is not :" + SampleText);
		}

		// wait for 3 second

		// Finding textbox using id locator and then using send keys to write in
		// it
		String name = "Aaravi Giri";
		d.findElement(By.id("fname")).sendKeys(name);
		// d.wait(3000);

		if (name == "Aaravi Giri") {
			System.out.println("Name is Correct");

		} else {
			System.out.println("Name is INCORRECT");
		}
		// Find radio button by name and check it using click() function
		d.findElement(By.id("female")).click();

		// Find checkbox by cssSelector and check it using click() function
		d.findElement(By.cssSelector("input.Automation")).click();

		// Using Select class for for selecting value from dropdown
		Select dropdown = new Select(d.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Database Testing");
		List<WebElement> l = dropdown.getOptions();
		l.size();
		System.out.println(l.size());

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getText());

	
			// Close the browser
			//d.close();

		}

	}

}
