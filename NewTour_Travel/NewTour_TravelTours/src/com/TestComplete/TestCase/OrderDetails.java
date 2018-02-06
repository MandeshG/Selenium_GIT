package com.TestComplete.TestCase;

import org.testng.annotations.Test;

import com.TestComplete.Page.*;

public class OrderDetails extends Base_Test {
	
	@Test
	 public void details(){
		LoginPage ll = new LoginPage(driver);
		ll.loginApplication("Tester", "test");
		
		Order oo= new Order(driver);
		oo.ProductInfo();
	}

}
