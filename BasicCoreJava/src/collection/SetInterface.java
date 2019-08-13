package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		/// hash set
		/*Set<String> set= new HashSet<>();
		set.add("gauri");
		set.add("anu");
		set.add("gauri");
		set.add("aa");
		set.add("bb");
		
		for(String s:set)
		{
			System.out.println(s);// o/p random
		}*/
		// linkhash set
		
		/*Set<String> set= new LinkedHashSet<>();
		set.add("gauri");
		set.add("anu");
		set.add("gauri");
		set.add("aa");
		set.add("bb");
		
		for(String s:set)
		{
			System.out.println(s);// o/p as per insertted
		}*/

		
		//tree set
		
		Set<String> set= new TreeSet<>();
		set.add("gauri");
		set.add("anu");
		set.add("gauri");
		set.add("aa");
		set.add("bb");
		
		for(String s:set)
		{
			System.out.println(s); // alphabetical
		}
	}

}
