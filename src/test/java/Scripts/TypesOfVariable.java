package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TypesOfVariable {

	public static void main(String[] args) 
	{
/*		TypesOfVariable x = new TypesOfVariable();
		x.display();
		x.print();*/
		System.out.println(TypesOfVariable.city);
		
	}
	
	static String city = "Bangalore"; //instance variable
			
	public void display()
	{
		String name = "Pavani"; //local variable
		System.out.println(name);
	}
	
	public void print()
	{
		System.out.println(city);
	}
	
	public static void enter()
	{
		System.out.println("Your name");
	}
}
