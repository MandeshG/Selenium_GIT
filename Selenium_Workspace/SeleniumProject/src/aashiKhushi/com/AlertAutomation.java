package aashiKhushi.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertAutomation {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d;
		d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL = "http://www.artoftesting.com/sampleSiteForSelenium.html";
		d.get(URL);
		
		//Maximize the Page
		d.manage().window().maximize();

		// Handling Alert Box and Click on the generate alert button
		d.findElement(By.cssSelector("div#AlertBox button")).click();

		Thread.sleep(3000);

		Alert alert = d.switchTo().alert();
		alert.accept();

		// Handling confirm box and Click on Generate Confirm Box
		d.findElement(By.cssSelector("div#ConfirmBox button")).click();
		Thread.sleep(3000);

		Alert confirmBox = d.switchTo().alert();

		// Using dismiss() command to dismiss the confirm box. Similarly accept
		// can be used to accept the confirm box
		confirmBox.dismiss();

	}

}
