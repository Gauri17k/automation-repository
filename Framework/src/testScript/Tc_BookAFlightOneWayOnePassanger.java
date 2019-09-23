package testScript;


//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import configuration.Config;
import library.Apllicationlibrary;
import pages.FlightFinder;
import pages.Homepage;

public class Tc_BookAFlightOneWayOnePassanger {
	WebDriver dr=null;

	@Test
	public void login() {
		
		Apllicationlibrary lib= new Apllicationlibrary();
		
	
		
		SoftAssert as=  new SoftAssert();
		
		
	
			dr=lib.launchBrowser("chrome"); // launch browser
			as.assertTrue(dr!=null);
			
			
			lib.nevigate(dr, Config.url); // navigate to the application
			
			
			String title=dr.getTitle();
			//login
			
			Homepage page1= new Homepage(dr);
			page1.login(Config.globalUser, Config.globalPassword);		
			
			//valiadtions
			
			as.assertTrue(dr.getTitle().equals(title));
			
		
	}
	@Test(dependsOnMethods = {"login"})
	
	public void bookAFlight()
	{
		FlightFinder page2= new FlightFinder(dr);
		
		page2.ClickoneWay();
		
		page2.selectPassanger("1");
		
		page2.clickContinu();
	}
}
