package Selenium;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_HashMap {

	public static void main(String[] args)
	{
		Map<String, Integer> hMap = new LinkedHashMap<String, Integer>();
		hMap.put("Amount", 400);
		hMap.put("Amount", 100000);
		hMap.put("Interest", 12);
		hMap.put("Tenure", 60);

		
		Iterator<String> itr = hMap.keySet().iterator();
		
		while(itr.hasNext())
		{
			String sKey = itr.next();
			System.out.println("Key is "+sKey+"-------"+" value is "+hMap.get(sKey));
		}


	}

}
