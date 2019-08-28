package basicAnnotation2;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestClass1 {
	
	
	
	@Test(priority=0,enabled=false)// enable used to skip
	public void test3() {
		
		System.out.println("test case 3");
		
		
	}
	
	@Test(priority=1)// enable used to skip
	public void test4() {
		
		
		throw new SkipException("skip this");
	
		
	}
	
	@Test(priority=0)// enable used to skip
	public void test5() {
		
		System.out.println("test case 5");
		
		
	}
	
	
/*	@Test(priority=2,dependsOnMethods= {"test2"}) //depend to excute dependable methode,
	public void test1() {
		
		System.out.println("test case 1");
		
	}
	
	@Test(priority=1)
	public void test2() {
		System.out.println("test case 2");
		
		
	}*/

}
