package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

WebDriver dr;
	
	public Homepage(WebDriver dr)
	{
		this.dr=dr;
	}
	
	By userName=By.name("userName");
	By Password=By.name("password");
	By Login= By.name("login");
	
	public void login(String username, String password)
	{
		dr.findElement(this.userName).sendKeys(username);
		dr.findElement(this.Password).sendKeys(password);
		dr.findElement(Login).click();
	}
}
