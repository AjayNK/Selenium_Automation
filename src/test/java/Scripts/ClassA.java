package Scripts;

public class ClassA{
	
	public static void main(String[] args)
	{
		ClassA c1 = new ClassA();
		c1.add();
	}
	
	static int a = 20;
	int b = 33;
	public void add()
	{
		int z = a+b;
		System.out.println(z);
	}
	
}
