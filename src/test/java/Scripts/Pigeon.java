package Scripts;

public class Pigeon extends Bird{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pigeon x = new Pigeon();
		x.eat();
		x.fly();
		x.color();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat millets");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("White in color");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Fly");
	}

}
