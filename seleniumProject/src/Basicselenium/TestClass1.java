package Basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass1 {
	
ChromeDriver dr ;
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		 dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		
		//to nevigate
		
		dr.get("http://newtours.demoaut.com/ ");
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		
		}
	
	@Test (dependsOnMethods= {"login"})
	public void logout() {
		
		dr.findElement(By.linkText("SIGN-OFF")).click();
		
	}
}
