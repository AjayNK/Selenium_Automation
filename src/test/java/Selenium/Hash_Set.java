package Selenium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash_Set {

	public static void main(String[] args) 
	{
		Set<String> arr = new HashSet<String>();
		
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
