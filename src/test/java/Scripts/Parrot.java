package Scripts;

public class Parrot extends Bird{

	public static void main(String[] args) 
	{
		Parrot x = new Parrot();
		x.eat();
		x.fly();
		x.color();
		
	}

	@Override
	public void eat() 
	{
		System.out.println("Parrot eat fruits & nuts");
	}

	@Override
	public void color()
	{
		System.out.println("Parrots are green in color");
	}

	@Override
	public void fly() 
	{
		System.out.println("Parrots fly high");
	}

}
