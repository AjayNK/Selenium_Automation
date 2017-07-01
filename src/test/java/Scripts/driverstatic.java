package Scripts;

public class driverstatic {
	
	public static void main(String[] args) {
		
		Staticmandv sd = new Staticmandv();
		System.out.println("----------------");
		Staticmandv sd1 = new Staticmandv();
		System.out.println("----------------");
		Staticmandv sd2 = new Staticmandv();
		
		Staticmandv.add();
		System.out.println(Staticmandv.a);

	}

}
