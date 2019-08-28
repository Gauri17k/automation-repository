package basicAnnotation2;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@Test// enable used to skip
	public void test1() {
		
		System.out.println("test 1 class2");
		
		
	}
	
	@Test// enable used to skip
	public void test2() {
		
		System.out.println("test 2 class2");
		
		
	}
	
	@Test// enable used to skip
	public void test3() {
		
		System.out.println("test 3 class2");
		
		
	}
	@BeforeMethod
	public void beforeMethode() {
		
		System.out.println("before methode class2");// to execute before  test case
		
	}

	@AfterMethod
public void afterMethode() { // to excute after test cases
		
		System.out.println("after methode class2");
		
	}
	
	@BeforeClass
	
	public void beforeClass() {
		
		System.out.println("before class");
	}
	
@AfterClass
	
	public void afterClass() {
		
		System.out.println("after class");
	}

@BeforeTest

@Parameters({"browser"})

public void masterSFDC(String browser)
{
	System.out.println("befor SFDC");
	
	System.out.println("browser:"+ browser);
}

@AfterTest
public void afterSFDC()
{
	System.out.println("after SFDC");
}

}
