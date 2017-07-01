package Scripts;

public class ConditionalStatements {

	public static void main(String[] args) 
	{
		
/*		int i = 10;
		int j = 10;
		if(i==j)
		{
		  System.out.println("Both values matching");
		}*/
		
/*		String x = "Pavani";
		String y = "pavani";
		if(x.equals(y))
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not Matched");
		}*/
		
		String x = "Java";
		if(x.equals("QTP"))
		{
		  System.out.println("QTP Course");
		}
		else if(x.equals("DotNet"))
		{
			System.out.println("DotNet Course");
		}
		else if(x.equals("Selenium"))
		{
			System.out.println("Java Course");
		}
		else
		{
			System.out.println("Invalid Course Entered");
		}

	}

}
