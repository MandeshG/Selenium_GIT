package aashiKhushi.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d;
		d = new FirefoxDriver();
		d.get("http://artoftesting.com/sampleSiteForSelenium.html");

		// Maximize the Browser
		d.manage().window().maximize();

		// Mouse Over to the button
		Actions MouseOver = new Actions(d);
		WebElement button = d.findElement(By.id("idOfButton"));
		MouseOver.moveToElement(button).perform();

		// Thread.sleep just for user to notice the event
		Thread.sleep(3000);

		// Closing the driver instance
		d.quit();

	}

}
