package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import library.Apllicationlibrary;

public class FlightFinder {

WebDriver dr;
	
	public FlightFinder(WebDriver dr)
	{
		this.dr=dr;
	}
	
	
	By OneWay=By.xpath("//input[@value='oneway']");
	By roundtrip=By.xpath("//input[@value='roundtrip']");
	
	By Passaenger=By.name("passCount");
	By countine=By.name("findFlights");
	
	

	
	public void ClickoneWay() {
		
      dr.findElement(OneWay).click();
			
	}
	
	public void selectPassanger(String numOfPass)
	
	{
		Select sel= new Select (dr.findElement(Passaenger));
		sel.selectByVisibleText(numOfPass);
	}
	
	public void clickContinu() {
		dr.findElement(countine).click();
	}
}
