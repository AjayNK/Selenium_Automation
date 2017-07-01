package Scripts;

public class Access_Modifier {

	public static void publicMethod()
	{
		System.out.println("This is public method");
	}
	
	private static void privateMethod()
	{
		System.out.println("This is private method");
	}
	
	protected static void protectedMethod()
	{
		System.out.println("This is protected method");
	}
	
	static void defaultMethod()
	{
		System.out.println("This is default method");
	}
	
	public static void main(String[] args) 
	{
		Access_Modifier.publicMethod();
		Access_Modifier.privateMethod();
		Access_Modifier.protectedMethod();
		Access_Modifier.defaultMethod();

	}

}
