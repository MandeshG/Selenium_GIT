package com.TestComplete.TestCase;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.TestComplete.Page.LoginPage;

public class Validate_LoginPage extends Base_Test {

	@Test
	public void loginValidation() {
		LoginPage ll = new LoginPage(driver);
		ll.loginApplication("Tester", "test");

		String ExpectedResult = "Web Orders";
		String actualResult = driver
				.findElement(By.cssSelector("#aspnetForm > table > tbody > tr > td:nth-child(1) > h1")).getText();
		Assert.assertEquals(ExpectedResult, actualResult);
		System.out.println(ExpectedResult);
		System.out.println(actualResult);

		
		/*
		WebElement OrderTable = driver.findElement(By.tagName("table"));
		List<String> columnNames = OrderTable.findElements(By.tagName("th")).stream().map(WebElement::getText)
				.map(String::trim).collect(Collectors.toList());
		System.out.println(columnNames);
*/
	}

}
