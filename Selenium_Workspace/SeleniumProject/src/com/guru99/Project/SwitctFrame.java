package com.guru99.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitctFrame {
	public static void main(String[] args) {
		
		WebDriver driver;
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		 String baseURL= "http://demo.guru99.com/selenium/deprecated.html";
		 driver.get(baseURL);
		 
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("Deprecated")).click();
		
		
		
	}
	

}
