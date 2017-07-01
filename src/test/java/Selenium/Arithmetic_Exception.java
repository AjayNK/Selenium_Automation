package Selenium;

public class Arithmetic_Exception {

	public static void main(String[] args) 
	{
		try
		{
		int c = 4/0;
		System.out.println(c);
		}
		
		catch(Exception e)
		{
			System.out.println("Passed");
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("Mandatory  Execution");
		}
		
		System.out.println("Outside the block");

	}

}
