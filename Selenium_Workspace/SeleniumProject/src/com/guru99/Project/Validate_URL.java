package com.guru99.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Validate_URL {
	public static void main(String[] args) {

		//WebDriver driver1;
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebDriver\\chromedriver.exe");
		WebDriver driver11=new ChromeDriver();
		
		driver11= new ChromeDriver();
		String baseURL = "http://demo.guru99.com/selenium/newtours/";
		driver11.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver11.manage().window().maximize();

		String expectedTitle = "Welcome: Mercury Tours";

		// Launch the URl and get the URL from Base URL
		driver11.get(baseURL);

		// Get the actual tittle
		String actualTitle = driver11.getTitle();
		System.out.println(actualTitle);

		/*
		 * Compare the actual title with the expected title and print the result
		 * PASS or FAIl
		 * 
		 * 
		 */

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Test Case is passed");

		} else {
			System.out.println("Test case is failed");
		}
		
		//Close the Firefox
		driver11.close();
	}

}
