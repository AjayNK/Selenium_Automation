package Scripts;

public class ClassB extends ClassA{

	public static void main(String[] args)
	{
		//ClassB c1 = new ClassB();
		//c1.add();
		
		ClassA c1 = new ClassA();
		c1.add();
		
	}
	
	int x = 100;
	int y = 300;
	public void add()
	{
		int z = x+y;
		System.out.println(z);
	}

}
