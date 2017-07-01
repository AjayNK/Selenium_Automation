package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement AccList = driver.findElement(By.id("nav-link-accountList"));
		
		Actions a = new Actions(driver);
		a.moveToElement(AccList).build().perform();
		
		//for double click
		//a.doubleClick(AccList).build().perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Find a Gift")).click();
		
		driver.close();

	}

}
