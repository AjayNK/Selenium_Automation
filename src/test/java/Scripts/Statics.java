package Scripts;

public class Statics {
	static int a=10;
	int b=20;
	int c=30;
	
	
	public Statics()
	{
		a++;
		System.out.println(a);
		
		b++;
		System.out.println(b);
		
		c++;
		System.out.println(c);
		
	}
	
	public static void add()
	{
		System.out.println(a+10);
		System.out.println(a);
		//System.out.println(b); non static variables cannot be accessed
		//System.out.println(c);
	}
}
