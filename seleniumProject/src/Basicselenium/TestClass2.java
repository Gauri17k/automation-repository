package Basicselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestClass2 {
	
	ChromeDriver dr ;
	
	@Test	
	public void BookFlight() throws InterruptedException {
		
	
			
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
			
			 dr= new ChromeDriver();
			
			dr.manage().window().maximize();
			
			//to nevigate
			
			dr.get("http://newtours.demoaut.com/ ");
			
			//textbox
			dr.findElement(By.name("userName")).sendKeys("mercury");
			dr.findElement(By.name("password")).sendKeys("mercury");
			
			//button
			dr.findElement(By.name("login")).click();
			
			//radio button
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		
		//dropdown
		
		WebElement ele=dr.findElement(By.name("passCount"));
		
		Select sel=new Select(ele);
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		
		sel.selectByValue("2");
		
		sel.selectByVisibleText("4");
		
		dr.findElement(By.name("findFlights")).click(); 
		
		WebElement table=dr.findElement(By.xpath("//table[@cellpadding='2'][@cellspacing='1'][1]/tbody"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr")); 
		
		for(WebElement r:rows) //enhance for loop- varible (r) of name array or collection -to iterate list data 
		{
			List<WebElement> cols=r.findElements(By.tagName("td")); 
			
			for (WebElement c:cols)
			{ 
				System.out.println(c.getText()); // to get value from column
			}
			
		}
		
		
		
		
	}

}
