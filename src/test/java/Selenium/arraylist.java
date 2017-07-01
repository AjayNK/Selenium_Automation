package Selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {

	public static void main(String[] args)
	{
		//insertion order is maintained & allows duplicates
				List<String> arr = new ArrayList<String>();
				
				arr.add("mango");
				arr.add("apple");
				arr.add("orange");
				arr.add("grapes");
				arr.add("mango");
				
				//for each
/*				for(String ele:arr)
				{
					System.out.println(ele);
				}*/

				//normal for loop
/*				for(int i=0;i<arr.size();i++)
				{
					System.out.println(arr.get(i));
				}*/
				
				//System.out.println(arr.get(2));
				
				//iterator
				Iterator<String> itr = arr.iterator();
				
				while(itr.hasNext())
				{
					//System.out.println(itr.next());
					String Actual_Res = itr.next();
					//System.out.println(Actual_Res);
					if(Actual_Res.equals("orange"))
					{
						System.out.println("Passed");
					}
				}

	}

}
