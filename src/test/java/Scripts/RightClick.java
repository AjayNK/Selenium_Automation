package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ImgLink = driver.findElement(By.linkText("Images"));
		
		Actions a = new Actions(driver);
		a.contextClick(ImgLink).build().perform();
		
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
