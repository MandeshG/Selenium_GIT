package aashiKhushi.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackwordForward {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d;
		d = new FirefoxDriver();
		String URL = "http://www.DemoQA.com";
		d.get(URL);
		d.manage().window().maximize();

		// Used for demo purpose only, not required

		WebElement logo = d.findElement(By.xpath(".//*[@id='menu-item-374']/a"));
		logo.click();

		// Navigate Back
		d.navigate().back();

		Thread.sleep(3000);

		d.navigate().forward();

	}

}
