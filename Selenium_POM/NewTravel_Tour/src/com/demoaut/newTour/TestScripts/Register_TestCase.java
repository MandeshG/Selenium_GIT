package com.demoaut.newTour.TestScripts;

import org.testng.annotations.Test;

import com.demount.newtour.Page.Register_Page;

public class Register_TestCase extends BaseTest{
	
	
	@Test
	public void RegisterUser(){
		Register_Page rr= new  Register_Page(driver);
		rr.contacInfo("Kritanjali", "Dhakal Giri", "123456456", "kritdhakal@gmail.com");
		rr.mailing();
		rr.UserInfo();
		rr.submit();
		
	
	}

	
	
	
}