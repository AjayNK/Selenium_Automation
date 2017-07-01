package Scripts;

public class ChildClass extends ParentClass{

	public static void main(String[] args)
	{
		ChildClass x = new ChildClass();
		x.div();
		x.mul();
		x.add();
		x.sub();
		System.out.println(x.a);
		System.out.println(x.b);
	}
	
	public void div()
	{
		System.out.println("Divide 2 numbers");
	}
	
	public void mul()
	{
		System.out.println("Multiply 2 numbers");
	}

}
