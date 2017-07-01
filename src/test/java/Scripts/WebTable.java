package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/index.php");
		
		driver.manage().window().maximize();
		List<WebElement> AllTbl= driver.findElements(By.tagName("table"));
		System.out.println(AllTbl.size());
		
		driver.close();

	}

}
