package collection;


import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
	List list= new ArrayList<>(); //// list of parametr as Object
		
		list.add("gauri");
		list.add("anu");
		list.add("aaa");

		
	List <String>list= new ArrayList<>();/// list with string parametr
		
		list.add("gauri");
		list.add("anu");
		list.add("aaa");
		list.add("gg");
		
			for(String s:list)
		{
			System.out.println(s);
		}/
		
		
List <String>list= new LinkList<>();/// list with string parametr
		
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
}
