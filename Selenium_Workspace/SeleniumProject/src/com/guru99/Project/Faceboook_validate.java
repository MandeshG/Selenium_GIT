package com.guru99.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Faceboook_validate {
	
	public static void main(String[] args) {
		WebDriver driver;
		
		driver= new FirefoxDriver();
		String baseURL=  "http://www.facebook.com";
		String Tagname= " ";
		driver.get(baseURL);
		
		Tagname= driver.findElement(By.id("u_0_2")).getTagName();
		System.out.println(Tagname);
		
	}

}
