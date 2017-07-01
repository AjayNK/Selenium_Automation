package Selenium;

public class ArrayOutOfBound {

	public static void main(String[] args)
	{
		try
		{
			int num[] = {4,7,9};
			System.out.println(num[5]);	
		}
		catch(Exception e)
		{
			System.out.println("Passed");
			System.out.println(e);
		}
		
		System.out.println("Outside of block");

	}

}
