package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestInterface extends CoursesImplement{

	public static void main(String[] args) 
	{
		CoursesImplement x = new CoursesImplement();
		x.java();
		x.hadoop();
		x.testing();
		x.selenium();
		x.sql();
		
		Courses x1 = new CoursesImplement();
		x1.java();
		x1.hadoop();
		x1.testing();
		
	}
	
}
