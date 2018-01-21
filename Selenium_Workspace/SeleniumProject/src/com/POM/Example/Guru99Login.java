package com.POM.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Login {
	WebDriver driver;
	
	By user99Guruname= By.name("uid");
	By passwordGuruname= By.name("password");
    By titleText =By.className("barone");
    By login= By.name("btnLogin");

    
    
    public Guru99Login(WebDriver driver){
    	this.driver= driver;
    	
    }
    
    public void setUsername(String username){
    	driver.findElement(user99Guruname).sendKeys(username);
    }
    
    public void setPassword(String password){
    	driver.findElement(passwordGuruname).sendKeys(password);
    	
    }
    
    public void login(){
    	driver.findElement(login).click();
    }
    
  //Get the title of Login Page

    public String getLoginTitle(){
		return driver.findElement(titleText).getText();
		/*
	     * This POM method will be exposed in test case to login in the application
	     * @param strUserName
	     * @param strPasword
	     * @return

	     */


    }
    
    public void logintoApplication(String username,String password){
    	this.setUsername(username);
    	this.setPassword(password);
    	this.login();
    	
    }
}


