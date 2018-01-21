package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {
	
	WebDriver driver;
	
	
	public LoginPageNew(WebDriver driver){
		this.driver= driver;
		
	}
	
	@FindBy(name="userName") 
	WebElement username;
	
	@FindBy(how= How.NAME,using= "password")
	WebElement password;
	
	@FindBy(how=How.NAME,using= "login")
	WebElement submit;
	
	
	public void login_NewTour(String uID, String uPwd){
		username.sendKeys(uID);
		password.sendKeys(uPwd);
		submit.click();
		
		
	}
	

}
