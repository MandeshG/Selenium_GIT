package aashiKhushi.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchingURL {
	 public static void main(String[] args) {
		
		 WebDriver d= new FirefoxDriver();
		 String url= "http:www.yahoo.com";
	  d.get(url);
	  System.out.println(url);
	}

}
