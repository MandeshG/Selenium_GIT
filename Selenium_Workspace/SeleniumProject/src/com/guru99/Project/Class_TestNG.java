package com.guru99.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Class_TestNG {
	public static String baseurl = "http://newtours.demoaut.com/";
	public static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
		driver.get(baseurl);
		verifyHomepageTitle();

	}

	public static void verifyHomepageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();

		try {
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Test Passed");
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("Test Case Failed ");
		}

	}

}
