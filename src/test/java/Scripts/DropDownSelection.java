package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php?");
		
		driver.manage().window().maximize();
		
		WebElement CountryLst = driver.findElement(By.name("country"));
		Thread.sleep(3000);
		
		Select x = new Select(CountryLst);
		//x.selectByVisibleText("INDIA");
		x.selectByIndex(22);

	}

}
