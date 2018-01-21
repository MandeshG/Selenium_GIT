package aashiKhushi.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d;
		d= new FirefoxDriver();
		d.get("http://artoftesting.com/sampleSiteForSelenium.html");
		
		//Maximize the browser
		d.manage().window().maximize();
		
		//Double click the button to launch an alertbox
		
		Actions dblClick= new Actions(d);
		WebElement btn = d.findElement(By.id("dblClkBtn"));
		dblClick.doubleClick(btn).perform();
		
		//Thread.sleep just for user to notice the event
		Thread.sleep(3000);
	}

}
