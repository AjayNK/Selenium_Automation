package Selenium;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) 
	{
		Map<String, Integer> hMap = new TreeMap<String, Integer>();
		hMap.put("Tenure", 60);
		hMap.put("Amount", 400);
		hMap.put("Interest", 12);
		hMap.put("Amount", 100000);
		
		Iterator<String> itr = hMap.keySet().iterator();
		
		while(itr.hasNext())
		{
			String sKey = itr.next();
			System.out.println("Key is "+sKey+"-------"+" value is "+hMap.get(sKey));
		}


	}

}
