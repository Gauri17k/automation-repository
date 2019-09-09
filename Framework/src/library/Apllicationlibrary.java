package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Config;

public class Apllicationlibrary {

	public WebDriver launchBrowser(String browerName) {
		
		WebDriver dr=null;
		
		if(browerName.equalsIgnoreCase("Chrome"))
		{
			
			System.getProperty("webdriver.chrome.driver", Config.chromedriver);	
			dr = new ChromeDriver();
			dr.manage().window().maximize();
			
		}
		return dr;
	}
	
	public String nevigate( WebDriver dr, String url)
	{
		dr.get(url);
		return dr.getTitle();
	}
	
	public boolean ifElementPresent( WebDriver dr, By element) {
		
		if (dr.findElements(element).size()>=1)
		return true;
		else
			return false;
			
	}
	
}
