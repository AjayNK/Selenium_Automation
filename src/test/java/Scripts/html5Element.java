package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class html5Element {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='month']/span/div[1]")).click();
		
		Thread.sleep(3000);
		
		Actions a = new Actions(driver);
		a.sendKeys("Sep").build().perform();
		
		Thread.sleep(3000);
		
		a.sendKeys(Keys.ENTER).build().perform();
		
		

	}

}
