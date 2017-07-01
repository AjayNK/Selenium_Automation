package Selenium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash_Map {

	public static void main(String[] args) 
	{
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("Amount", 100000);
		hMap.put("Interest", 12);
		hMap.put("Tenure", 60);
		hMap.put("Ifsc Code", 12002);
		hMap.put("Branch Code", 007);
		hMap.put("Amount", 400);
		
		Iterator<String> itr = hMap.keySet().iterator();
		
		while(itr.hasNext())
		{
			String sKey = itr.next();
			System.out.println("Key is "+sKey+">>>>>><<<<<<"+" value is "+hMap.get(sKey));
		}

	}

}
