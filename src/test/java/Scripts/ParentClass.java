package Scripts;

public class ParentClass {

	public static void main(String[] args) 
	{
		ParentClass x = new ParentClass();
		x.add();
		x.sub();
	}
	
	int a = 100;
	int b = 200;
	
	public void add()
	{
		System.out.println("Adding 2 numbers");
	}
	
	public void sub()
	{
		System.out.println("Substract 2 numbers");
	}

}
