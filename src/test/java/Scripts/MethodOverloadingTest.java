package Scripts;

public class MethodOverloadingTest {

	public static void main(String[] args) 
	{
		MethodOverloadingTest.add(5, 7);
		MethodOverloadingTest.add(5, 6, 9);
		MethodOverloadingTest.add("Pavani", "Reddy");
		MethodOverloadingTest.add(3.2, 5.9);
	}
	
	//method with arguments
	public static void add(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	//Method Overloading based on arguments
	public static void add(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println(d);
	}
	
	//Method Overloading based on datatype
	public static void add(String a, String b)
	{
		String c = a+" "+b;
		System.out.println(c);
	}
	
	public static void add(double a, double b)
	{
		double c = a+b;
		System.out.println(c);
	}
	
	

}
