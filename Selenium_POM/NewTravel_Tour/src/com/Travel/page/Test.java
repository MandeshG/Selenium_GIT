package com.Travel.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {
	
	  public static void main(String[] args) {
		
		  WebDriver d;
		  d= new FirefoxDriver();
		  d.get("http://newtours.demoaut.com/");
		  d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  d.manage().window().maximize();
		  d.getCurrentUrl();
		
		  d.findElement(By.name("userName")).sendKeys("mercury");
		  d.findElement(By.name("password")).sendKeys("mercury");
		  d.findElement(By.name("login")).click();
		
	}

}
