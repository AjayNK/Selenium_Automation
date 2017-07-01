package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TypeAhead_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gsfi")).sendKeys("abdul kalam");
		
		Thread.sleep(3000);	
		
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);	
		
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);	
		
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);	
		
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);	
		
		driver.close();
		
		
	}

}
