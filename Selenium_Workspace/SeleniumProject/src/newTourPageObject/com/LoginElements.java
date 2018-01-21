package newTourPageObject.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginElements {
	
	WebDriver driver;
	
	 WebElement userName;
	 WebElement password;
	 WebElement signON;
	 
	 
	 public LoginElements(WebDriver driver){
		 this.driver= driver;
		 
		 userName= driver.findElement(By.name("userName"));
		 password= driver.findElement(By.name("password"));
		 signON= driver.findElement(By.name("login"));
		 
	 }
	 
	 public void username(String user){
		 userName.sendKeys(user);
		 
	 }
	 public void password(String pwd){
		 password.sendKeys(pwd);
		 
	 }
	 
	 public void signOn(){
		 signON.click();
		 
	 }
	 
	 

}
