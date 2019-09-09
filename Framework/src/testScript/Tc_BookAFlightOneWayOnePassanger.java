package testScript;


//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import configuration.Config;
import library.Apllicationlibrary;
import pages.Homepage;

public class Tc_BookAFlightOneWayOnePassanger {

	@Test
	public void script() {
		
		Apllicationlibrary lib= new Apllicationlibrary();
		
		WebDriver dr=null;
		
		SoftAssert as=  new SoftAssert();
		
		try
		{
			dr=lib.launchBrowser("chrome"); // launch browser
			as.assertTrue(dr!=null);
			
			
			lib.nevigate(dr, Config.url); // navigate to the application
			
			
			String title=dr.getTitle();
			//login
			
			Homepage page1= new Homepage(dr);
			page1.login(Config.globalUser, Config.globalPassword);		
			
			//valiadtions
			
			as.assertTrue(dr.getTitle().equals(title));
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}finally
		{
			if (dr!=null)
			dr.close();
			as.assertAll();
		}
		
		
	}
}
