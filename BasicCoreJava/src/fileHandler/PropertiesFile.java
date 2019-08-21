package fileHandler;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties g= new Properties();
		
		//FileInputStream File= new FileInputStream("D:\\automation-repository\\BasicCoreJava\\src\\fileHandler\\G.properties");
		
		FileInputStream File= new FileInputStream(System.getProperty("user.dir")+"\\src\\fileHandler\\G.properties");
		
		g.load(File);
		
		Thread.sleep(5000);
		
		System.out.println(g.get("name"));
		System.out.println(g.get("surname"));
		System.out.println(g.get("age"));
		
	//	System.out.println(System.getProperty("user.dir"));// used to access differt file
		
	}

}
