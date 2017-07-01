package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProtocolTesting {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.cleartrip.com/");
		
		driver.manage().window().maximize();
		
		String currURL = driver.getCurrentUrl();
		
		if(currURL.contains("https"))
		{
			System.out.println("Secured Website");
		}
		else
		{
			System.out.println("Not Secured Website");
		}
		
		driver.close();

	}

}
