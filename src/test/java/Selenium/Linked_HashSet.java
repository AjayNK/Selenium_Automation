package Selenium;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_HashSet {

	public static void main(String[] args) 
	{
		Set<String> arr = new LinkedHashSet<String>();
		
		arr.add("mango");
		arr.add("orange");
		arr.add("apple");
		arr.add("grapes");
		arr.add("mango");
		arr.add("apple");
		
		Iterator<String> itr = arr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
