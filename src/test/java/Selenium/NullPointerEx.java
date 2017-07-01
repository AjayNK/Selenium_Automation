package Selenium;

public class NullPointerEx {

	public static void main(String[] args) 
	{
		try
		{
		String x =null;
		System.out.println(x.length());
		}
		catch(Exception e)
		{
			System.out.println("Passed");	
			System.out.println(e);
		}
		
		System.out.println("Outside of block");

	}

}
