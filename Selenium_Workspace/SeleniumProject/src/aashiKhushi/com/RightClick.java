package aashiKhushi.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d;
		d = new FirefoxDriver();
		String URL = "http://artoftesting.com/sampleSiteForSelenium.html";
		d.get(URL);
		d.manage().window().maximize();

		// Right Click
		Actions action = new Actions(d);
		WebElement searchBox=d.findElement(By.id("fname"));
		action.contextClick(searchBox).perform();
		
		// //Thread.sleep just for user to notice the event
		Thread.sleep(4000);

	}

}
