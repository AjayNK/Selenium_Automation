package herokuapp;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyHeader {
		
	WebDriver driver;

	@Test(priority=1)
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	public void maximizeApp()
	{
		driver.manage().window().maximize();
	}
	
	
	@Test(priority=3)
	public void verifyHeaderTxt()
	{
		WebElement objHeader = driver.findElement(By.xpath("//*[text()='Challenging DOM']"));
		String strHeader = objHeader.getText();
		String strExpected = "Challenging DOM";
		Assert.assertEquals(strExpected, strHeader);
	}
	
	@Test(priority=4)
	public void verifyHeaderParagraph()
	{
		WebElement objHeader = driver.findElement(By.xpath("//*[starts-with(text(),'The hardest part')]"));
		String strHeader = objHeader.getText();
		String strExpected = "The hardest part in automated web testing is finding the best locators (e.g., ones that well named, unique, and unlikely to change). It's more often than not that the application you're testing was not built with this concept in mind. This example demonstrates that with unique IDs, a table with no helpful locators, and a canvas element."; 
		Assert.assertEquals(strExpected, strHeader);
	}
	
	@Test(priority=5)
	public void closeBrowser()
	{
		driver.close();
	}

}
