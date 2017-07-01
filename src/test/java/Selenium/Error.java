package Selenium;

public class Error {

		int c;
		public int div(int a, int b) throws Exception
		{
			if(b==0)
			{
				throw new Exception("oh incorrect data, denominator is zero"); 
			}
			else
			{
				c=a/b;
			}
			return c;
		
	}

}
