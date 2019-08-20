package collection;


//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
/*	List <String>list= new ArrayList<>(); //// list of parametr as Object - arraylist
		
		list.add("gauri");
		list.add("anu");
		list.add("aaa");

		for(String s:list)
		{
			System.out.println(s);
		}*/
		
	List <String>list= new LinkedList<>();/// list with string parametr-linked list
		
		list.add("gauri");
		list.add("anu");
		list.add("aaa");
		list.add("gg");
		
			for(String s:list)
		{
			System.out.println(s);
		}
		
		

		
		
	}

}

