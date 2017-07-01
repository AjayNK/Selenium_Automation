package Scripts;

public class Display {
	
	public static int sum(int a, int b) 
	{
		int c = a+b;
		return c;
	}
	
	public static String sum(String a, String b) 
	{
		String c = a+" "+b;
		return c;
	}
	
	public static void main(String[] args)
	{
		int x = Display.sum(4, 8);
		System.out.println(x);
		
		String y = Display.sum("Pavani", "Reddy");
		System.out.println(y);

	}

}
