package com.NewTourTravel.TestScripts;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//import com.NewTourTravel.Page.LoginPage;

public class Verify_RegisterPage extends BaseTest{
	

	
	
	@Test
	public void Verify_Register(){
		//LoginPage ll= new LoginPage(driver);
		
		
	// Click on the Register Page
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
/*	
	// Select Country
		Random rand= new Random();
		
		Select country= new Select(driver.findElement(By.name("country")));
		List<WebElement>CD=country.getOptions();
		
		int DC= CD.size();
		
		for (int i = 0; i < DC; i++) {
			
			String value= CD.get(i).getText();
			System.out.println(value);
			
			int cDropdown= rand.nextInt(DC);
			CD.get(cDropdown).click();
			
			
			
		}
	
	*/
		Random rand=  new Random();
		
		Select Country =  new Select(driver.findElement(By.name("country")));
		  List<WebElement>cc=Country.getOptions();
		System.out.println(cc.size());
		  int cd= cc.size();
		 
		  
		  for (int i = 0; i < cd; i++) {
			  String value= cc.get(i).getText();
			  System.out.println(value);
			  int cdrop= rand.nextInt(cd);
			 cc.get(cdrop).click();
			
		}
		
		
		
	}

}
