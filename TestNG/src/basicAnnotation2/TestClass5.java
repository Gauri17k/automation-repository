package basicAnnotation2;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass5 {
	
	@Test// enable used to skip
	public void test1() {
		
		System.out.println("test 1 class5");
		
		
	}
	
	@Test// enable used to skip
	public void test2() {
		
		System.out.println("test 2 class5");
		
		
	}
	
	@Test// enable used to skip
	public void test3() {
		
		System.out.println("test 3 class5");
		
		
	}
	@BeforeMethod
	public void beforeMethode() {
		
		System.out.println("before methode class5");// to execute before  test case
		
	}

	@AfterMethod
public void afterMethode() { // to excute after test cases
		
		System.out.println("after methode class5");
		
	}
	
	@BeforeClass
	
	public void beforeClass() {
		
		System.out.println("before class");
	}
	
@AfterClass
	
	public void afterClass() {
		
		System.out.println("after class");
	}

@BeforeSuite
public void masterSFDC()
{
	System.out.println("befor suite");
}

@AfterSuite
public void afterSFDC()
{
	System.out.println("after suite");
}
}
